//video 28,using cucumber n BDD framework
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private WebDriver d;
private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    //return type of By.id is By only
    //we locate element using driver object
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver d){
    this.d = d;
    if(!d.getTitle().equals("TestProject Demo")){
        //if url doesn't match test case will fail in the beginning only
        throw new IllegalStateException("This is not login page. The current Page is" + d.getCurrentUrl());
    }
    }
    public void enterUsername( String username){
        //we have to locate the element,this is atomic operation,1 step 1 operation
        //this is returning loginpage,test class going to pass the value as its the consumer class here
        d.findElement(txt_username).sendKeys(username);

    }
    public void  enterPassword(String password){
        d.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        d.findElement(btn_login).click();
    }
    public boolean checkLogOutIsDisplayed(){
        return d.findElement(btn_logout).isDisplayed();
        //trying to verify whether logout button is displayed or not thats how return type is boolean
    }
//no assertion here, for assertion separated TestCase class needs to be created,thats called POM

public void loginValidUser(String username, String password){
    d.findElement(txt_username).sendKeys(username);
    d.findElement(txt_password).sendKeys(password);
    d.findElement(btn_login).click();
    //this is utility method, performing operation in one go instead of atomic operation
}
}