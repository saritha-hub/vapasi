package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage1;
import suite.SuiteManager;
import testdata.LoginCredentials;
import util.DriverManager;
import pages.BasePage;

import java.util.concurrent.TimeUnit;


public class SearchForItems extends SuiteManager {

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
