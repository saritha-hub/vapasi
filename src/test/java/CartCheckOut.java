import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CartCheckOut {
    public static void main(String ar[]) {

    System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
    WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
       // driver.findElement(By.xpath("//span[text()='Ruby Baseball Jersey']")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("spree_user_email")).sendKeys("pitla.sarita@gmail.com");
        //spree_user_email
        driver.findElement(By.id("spree_user_password")).sendKeys("123456");
        driver.findElement(By.name("commit")).click();

        Select dropdown = new Select(driver.findElement(By.id("taxon")));
        dropdown.selectByVisibleText("Brands");

        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ruby");

        driver.findElement(By.xpath("//span[text()='Ruby Baseball Jersey']")).click();



}

}