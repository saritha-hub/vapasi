package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFileReader {
    Properties prop;

    public ConfigFileReader(){
        String configfilename = "testConfig.properties";
        FileInputStream inputStream = null;
        this.prop = new Properties();
        String configfilepath = System.getProperty("user.dir")+ "/" +"src/test/TestData/Config" + "/" +configfilename;

        try{
            inputStream = new FileInputStream(configfilepath);
            prop.load(inputStream);

        }
        catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public  String getProperty(String propertyName){
        return this.prop.getProperty(propertyName);
    }
}
