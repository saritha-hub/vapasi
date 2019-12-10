package testdata;

import org.testng.annotations.DataProvider;

public class LoginCredentials {

    @DataProvider(name="logincredentials")
    public static Object[][] LoginData(){
        return new Object[][]{
                {"sarita@gmail.com","12345678"}
        };
    }
}
