import org.openqa.selenium.By;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginTestNgDemo extends SuiteManager {

    @Test
    public void verifyLogin(){
//        System.setProperty("webDriverManager.driver.chrome.DriverManager.driver", "/Users/techops/Downloads/chromeDriverManager.driver 5");
//        WebDriverManager.driver DriverManager.driver = new ChromeDriverManager.driver();
        DriverManager.driver.get("https://spree-vapasi-prod.herokuapp.com/");
        DriverManager.driver.manage().window().maximize();
        DriverManager.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        DriverManager.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DriverManager.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

        DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys("sarita@gmail.com");
        DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        DriverManager.driver.findElement(By.name("commit")).click();
        DriverManager.driver.findElement(By.xpath("//a[text()='Create a new account']")).click();
        DriverManager.driver.findElement(By.id("spree_user_email")).sendKeys("pitla.sarita@gmail.com");
        DriverManager.driver.findElement(By.id("spree_user_password")).sendKeys("123456");
        DriverManager.driver.findElement(By.id("spree_user_password_confirmation")).sendKeys("123456");
        DriverManager.driver.findElement(By.name("commit")).click();

    }
}
