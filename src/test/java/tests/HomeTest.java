package tests;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage1;
import pages.ProductPage;
import suite.SuiteManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;
import util.DriverManager1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HomeTest extends SuiteManager {

        ConfigFileReader config = new ConfigFileReader();
        public BasePage basePage;
        public LoginPage1 loginpage;
        public HomePage homepage;
        public ProductPage productpage;
        ArrayList<String> test = new ArrayList<String>();
        @Test
        public void getTitle() {
            basePage = new BasePage();
            loginpage = new LoginPage1();
            loginpage = basePage.clickingButton();
           // String title = loginpage.getLoginPageTitle();
            //System.out.println(title);
            // Assert.assertEquals(title,"homespree");
            homepage = new HomePage();
            homepage = loginpage.login(config.getProperty("username"), config.getProperty("password"));
        }
        @Test(priority = 1)
        public void getLoginDetails() {
            String text = homepage.verifyMsgIsDisplayed();
            System.out.println(text);
            Assert.assertEquals(text, "Logged in successfully");
        }
        @Test
        public void clickSelectedItems() {
            productpage=new ProductPage();
            homepage=new HomePage();
            homepage.getProperties(config.getProperty("searchprod"));
            List<String> list1 = homepage.doverifyListOfBags();
            for(int i=0;i<list1.size();i++)
            {
                String text=list1.get(i);
                System.out.println(text);
                Assert.assertTrue(text.contains("Bag"));
            }
            productpage=homepage.doClick();
        }
    }


