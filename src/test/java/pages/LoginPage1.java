package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class LoginPage1 extends SuiteManager {

    public LoginPage1()
    {
        PageFactory.initElements(DriverManager.driver,this);
    }

    @FindBy(id ="#spree_user_email")
    private WebElement usernameFiled;

    @FindBy(id="spree_user_password")
    private WebElement password;

    public void enterValue(WebElement field, String value){
        field.click();
        field.clear();
        field.sendKeys(value);

    }
    public HomePage login(String user, String password){
        enterValue(usernameFiled,user);
        enterValue(this.password, password);
        return new HomePage();

    }

    public void getLoginPageTitle(){
            DriverManager.driver.getTitle();
    }


}
