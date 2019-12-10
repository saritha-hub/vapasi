package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;

    public DriverManager(){
        String chromedriverpath = System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver 5");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

    }
}
