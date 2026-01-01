package user;

import common.BaseTest;
import constants.Endpoints;
import Payloads.LoginRequestBody;
import utils.RequestSpecFactory;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test(description = "Given valid credentials when login API is called then access token is generated")
    public void loginAndGetToken() {

        Response response =
                given(RequestSpecFactory.defaultSpec())
                        .body(LoginRequestBody.createLoginBody())
                        .when()
                        .post(Endpoints.LOGIN)
                        .then()
                        .statusCode(200)
                        .extract().response();

        accessToken = response.jsonPath().getString("accessToken");
        assertNotNull(accessToken, "Access token should not be null");
    }
}
