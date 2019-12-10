package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.ConfigFileReader;
import util.DriverManager;

public class SuiteManager {

    DriverManager drivermanager;
    private static ConfigFileReader config =new ConfigFileReader();

    @BeforeSuite(alwaysRun = true)
    public void startDriver(){
        drivermanager = new DriverManager();
    }

    @AfterSuite(alwaysRun = true)
    public void quitDriver(){
        drivermanager.driver.quit();
    }

    public void launchURL(){
        drivermanager.driver.manage().window().maximize();
        String baseurl = config.getProperty("base_url");
        drivermanager.driver.get(baseurl);
      //String username = config.getProperty("username");
      //System.out.println(username);
      //drivermanager.driver.get(username);


    }

}
