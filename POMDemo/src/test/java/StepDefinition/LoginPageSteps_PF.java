package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class LoginPageSteps_PF {
    WebDriver d = null;
    LoginPage_PF login;
    HomePage_PF home;
    @Given("^Browser is open$")
    public void browser_is_open(){
        System.out.println(" === I am inside loginPageSteps_PF class ====");
        System.out.println("inside step - browser is open");
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        d.manage().window().maximize();
    }

    @And("^user is on login page$")
    public void user_is_on_login_page() {
        d.navigate().to("https://example.testproject.io/web/");
        //i am navigating cz my page is already open in browser
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws InterruptedException {
        login = new LoginPage_PF(d);
        //passing object of ChromeDriver
        login.enterUsername(username);
        //uername priya is passed here
        login.enterPassword(password);
        Thread.sleep(2000);


    }

    @And("^user clicks on login$")
    public void user_clicks_on_login() {
        login.clickOnLogin();

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws InterruptedException{
        Assert.assertTrue(home.checkLogoutIsDisplayed());
        home = new HomePage_PF(d);
        //d.findElement(By.id("logout")).isDisplayed();
        sleep(2000);
        d.close();
        d.quit();

    }
}
