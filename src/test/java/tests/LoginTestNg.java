package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import suite.SuiteManager;
import util.DriverManager;
import testdata.LoginCredentials;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class LoginTestNg extends SuiteManager {


//    @DataProvider
//    public static Object[][] logincredentials() {
//        return new Object[][]{};
//    }

    public BasePage basePage;
    public LoginPage1 loginPage1;
    public HomePage homePage;

   // basePage = new BasePage(DriverManager.driver);
    //LoginPage1 = basePage.clickingButton();
    //Homepage = loginpage1.login(loginid, password);

    @BeforeTest
    public void enterDetails(){



    }

   // @Test(dataProvider = "logincredentials", dataProviderClass = LoginCredentials.class)
    public void verifyLogin(String loginid, String password) {
       // System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
        //WebDriver driver = new ChromeDriver();
        //river.get("https://spree-vapasi-prod.herokuapp.com/");

        //DriverManager.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();
        DriverManager.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();
       // System.out.println(loginid);

      //  DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys("sarita@gmail.com");
        //DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        DriverManager.driver.findElement(By.name("commit")).click();

    }


}
