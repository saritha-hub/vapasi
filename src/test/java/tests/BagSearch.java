package tests;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;
import util.DriverManager1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class BagSearch extends SuiteManager {

    ConfigFileReader config = new ConfigFileReader();

    @Test
    public void searchForBags(){
        DriverManager1.driver.manage().window().maximize();
        DriverManager1.driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
        DriverManager1.driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        DriverManager1.driver.findElement(By.xpath("//li[@id='link-to-login']//a[@class='nav-link text-white']")).click();

        String username = config.getProperty("username");
        String password = config.getProperty("password");
        DriverManager1.driver.findElement(By.id("spree_user_email")).sendKeys(username);
        //spree_user_email
        DriverManager1.driver.findElement(By.id("spree_user_password")).sendKeys(password);
        DriverManager1.driver.findElement(By.name("commit")).click();

        //search box
        Select dropdown = new Select(DriverManager1.driver.findElement(By.id("taxon")));
        dropdown.selectByVisibleText("Categories");

        String searchs= "//input[@type='search']";
        String searchbutton= "//input[@class='btn btn-success']";

        String searchvalue= config.getProperty("search");
        ///System.out.println("searchvalue "+searchvalue);

        DriverManager1.driver.findElement(By.xpath(searchs)).sendKeys(searchvalue);

        DriverManager1.driver.findElement(By.xpath(searchbutton)).click();

       /// System.out.println("clickon search button " +searchvalue);

       // WebElement element1 =DriverManager1.driver.findElement(By.xpath("//div[@data-hook='products_list_item'][1]"));
        //String bag1 = element1.getText();
        //System.out.println("bag1"+bag1);



               WebElement element11 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Ruby on Rails Baseball Jersey']"));
        String bag11 = element11.getText();
        System.out.println("bag11"+bag11);

        WebElement element22 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Ruby on Rails Bag']"));
        String bag22 = element22.getText();
        System.out.println("bag22"+bag22);


        WebElement element33 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Apache Baseball Jersey']"));
        String bag33 = element33.getText();
        System.out.println("bag33"+bag33);

        WebElement element44 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Ruby Baseball Jersey']"));
        String bag44 = element44.getText();
        System.out.println("bag44"+bag44);

        WebElement element55 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Spree Bag']"));
        String bag55 = element55.getText();
        System.out.println("bag55"+bag55);

        WebElement element66 =DriverManager1.driver.findElement(By.xpath("//span[@class='info mt-3 d-block' and @title='Spree Baseball Jersey']"));
        String bag66 = element66.getText();
        System.out.println("bag66"+bag66);


        ArrayList<String> list = new ArrayList<String>();
        list.add(bag11);
        list.add(bag22);
        list.add(bag33);
        list.add(bag44);
        list.add(bag55);
        list.add(bag66);
        Iterator it = list.iterator();
        while(it.hasNext()){
            String st  = (String) it.next();
            System.out.println("list of bag names" +st);
                            if(st.contains("bag")){
                                 System.out.println("true");
                            }
                            else{
                                         System.out.println("false");
                            }

        }
        /*
        String text="bag";
         if(list.contains(text)) {
             System.out.println("true");
         }
             else {
                 System.out.println("false");
             }
                  */
        
             //
           //String text="bag";

        for(int i=0;i<list.size();i++){
          // boolean ans = list.contains("bag") ;
            String s1 = list.get(i) ;
                         System.out.println("s1" +s1);        
            if(s1.contains("Bag")){
                System.out.println("contains bag");
            }
            else
                {
                   System.out.println("contains no bag");
            }
        }

         }
    }


