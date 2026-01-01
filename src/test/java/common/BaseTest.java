package common;



import config.EnvConfig;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
public class BaseTest {

    protected static String accessToken;
    protected static int userId;


    @BeforeSuite
    public void setup() {
        RestAssured.baseURI = EnvConfig.get("BASE_URL");
    }
}
