package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class DriverManager {
    public static WebDriver driver;
    public static final String USERNAME = "sarithap3";
    public static final String AUTOMATE_KEY = "hybdEf6GSqyhsv6eRF5q";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public DriverManager() throws MalformedURLException {
        //String chromedriverpath = System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver 5");

       // driver = new ChromeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "79.0 beta");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

         driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

    }
}
