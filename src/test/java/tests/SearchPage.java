package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.DriverManager;
import util.ConfigFileReader;

import java.util.concurrent.TimeUnit;

public class SearchPage extends SuiteManager {

    ConfigFileReader config = new ConfigFileReader();

    @Test
    public void searchItem(){
        DriverManager.driver.manage().window().maximize();
        DriverManager.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        DriverManager.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         String searchs="//input[@type='search']";
         String searchbutton="//input[@class='btn btn-success']";
        String searchvalue= config.getProperty("search");
        DriverManager.driver.findElement(By.xpath(searchs)).sendKeys(searchvalue);

        DriverManager.driver.findElement(By.xpath(searchbutton)).click();




        //Select dropdown = new Select(DriverManager.driver.findElement(By.id("taxon")));
       // dropdown.selectByVisibleText("Brands");
       // DriverManager.driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ruby");
        //DriverManager.driver.findElement(By.xpath("//input[@type='search']"));

    }


}
