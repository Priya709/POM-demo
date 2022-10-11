package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
    @FindBy(id = "name")
    WebElement txt_username;

     @FindBy(id = "password")
    WebElement txt_password;
     //locate id=password n inject/populate this value into txt_password called value injection

     @FindBy(id = "login")
    WebElement btn_login;

    // @FindBy(partialLinkText = "Ram")
    //WebElement>myLinks;

   // @FindBy(how= How.ID, using = "name")
    //WebElement abc;
    WebDriver d;

    public LoginPage_PF(WebDriver driver){
        this.d = driver;
        PageFactory.initElements(driver,this);
        //above line says initialise all WebElements on this page taking this driver as reference
        //whenever this line gets executed this constructor gets called
      //  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
       // PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }
 public void enterUsername(String username){
        txt_username.sendKeys(username);
        //in PF we are not using driver.findElement,no logic to locate element,no driver is written
     //class pageFactory is taking responsibility of locating element txt_username n initialising it
 }
 public void enterPassword(String password){
        txt_password.sendKeys(password);
 }
 public void clickOnLogin(){
        btn_login.click();
 }
}
