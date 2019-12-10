import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SearchItems {

    public static void main(String ar[]) {

        System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
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
        /////
      //  driver.findElement(By.xpath("//button[text()='Apply']")).click();
        driver.findElement(By.xpath("//input[@id='quantity']"));
        driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();

        //for checkout automation

        //driver.findElement(By.xpath("//*[@id='checkout-link']")).click();
        //button[@id='checkout-link']
        //driver.findElement(By.xpath("//button[text()='Checkout']")).click();
       // driver.findElement(By.xpath("//button[@id='checkout-link' and @name='checkout']")).click();
        //*[@id="checkout-link"]
        //driver.findElement(By.xpath("//button[contains(@id,'checkout-link')]")).click();
       // driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();

        //driver.findElement(By.xpath("//div[@class='form-group']//button[@id='checkout-link' and @name='checkout' and @class='btn btn-lg btn-success']")).click();

        driver.findElement(By.xpath("//div[@class='form-group']//button[contains(text(),'Checkout')]")).click();


    }
}
