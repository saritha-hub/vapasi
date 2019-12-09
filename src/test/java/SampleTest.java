import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SampleTest {

    public static void main(String ar[]) {

        System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

        driver.findElement(By.id("spree_user_email")).sendKeys("sarita@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.xpath("//a[text()='Create a new account']")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("pitla.sarita@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("123456");
        driver.findElement(By.id("spree_user_password_confirmation")).sendKeys("123456");
        driver.findElement(By.name("commit")).click();


        Select dropdown = new Select(driver.findElement(By.id("taxon")));
        dropdown.selectByValue("1");

    }


}
