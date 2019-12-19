package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage1;
import suite.SuiteManager;
import util.DriverManager;

import java.util.concurrent.TimeUnit;

public class CheckCart extends SuiteManager {

    public BasePage basePage;

    @Test
    public void clicklogin(){
        DriverManager.driver.manage().window().maximize();
        DriverManager.driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        DriverManager.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        basePage = new BasePage();
        LoginPage1 loginpage1 =  basePage.clickingButton();




    }


}
