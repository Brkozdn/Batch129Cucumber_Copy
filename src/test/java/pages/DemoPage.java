package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {


    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    /*







     */

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;


    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement login;

}
