import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Loginpage {

    @Test
    public void loginclick(){

        System.setProperty("webdriver.chrome.driver", "/Users/techops/Downloads/chromedriver 5");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String logiinButton ="//li[@id='link-to-login']//a[@class='nav-link text-white']";
        //driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();
        String userEmail = "spree_user[email]";
        //driver.findElement(By.id("spree_user_email")).sendKeys("pitla.sarita@gmail.com");
        String password = "spree_user_password";
       // driver.findElement(By.id("spree_user_password")).sendKeys("123456");


        //code for automation =========
        driver.findElement(By.xpath(logiinButton)).click();
        driver.findElement(By.name(userEmail)).sendKeys("pitla.sarita@gmail.com");
        //driver.findElement(By.id("spree_user_email")).sendKeys("pitla.sarita@gmail.com");

        driver.findElement(By.id(password)).sendKeys("123456");

        driver.findElement(By.name("commit")).click();

        List<WebElement> selectedprodts = driver.findElements(By.xpath("//select[@id='taxon']"));
        System.out.println(selectedprodts.size());

        for(int i=0;i<selectedprodts.size();i++){
            System.out.println("selectedprodts"+ selectedprodts.get(i));

        }

        WebElement searchbutton = driver.findElement(By.xpath("//input[@type='search']"));
        searchbutton.sendKeys("ruby");

        WebElement clicksearchButton =  driver.findElement(By.xpath("//input[@type='submit']"));
        clicksearchButton.click();

       String productlist = "//div[@data-hook='products_list_item'][2]";

        driver.findElement(By.xpath(productlist)).click();

        //driver.findElement(By.xpath("//input[@type='number']")).sendKeys("3");

        WebElement addtocartbttn = driver.findElement(By.xpath("//button[@name='button']"));
        addtocartbttn.click();

        WebElement checkoutbttn = driver.findElement(By.xpath("//button[@name='checkout']"));

        checkoutbttn.click();

    }


}