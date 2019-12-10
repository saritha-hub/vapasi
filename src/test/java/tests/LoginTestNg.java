package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginTestNg extends SuiteManager {
    @Test
    public void verifyLogin() {
       // System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
        //WebDriver driver = new ChromeDriver();
        //river.get("https://spree-vapasi-prod.herokuapp.com/");

        //DriverManager.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();
        DriverManager.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

        DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys("sarita@gmail.com");
        DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        DriverManager.driver.findElement(By.name("commit")).click();

    }
}
