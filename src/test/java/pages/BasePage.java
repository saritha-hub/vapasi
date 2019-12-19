package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverManager;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverManager.driver, this);

    }
    @FindBy(id ="#spree_user_email")
    private WebElement usernamefield;

    @FindBy(id="spree_user_password")
    private WebElement passwordfield;


    @FindBy(css = "#link-to-login")
    private WebElement loginButton;

    public LoginPage1 clickingButton(){
        loginButton.click();
        return new LoginPage1();
    }

}
