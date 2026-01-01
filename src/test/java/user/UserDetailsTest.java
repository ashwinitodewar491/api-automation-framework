package user;

import common.BaseTest;
import constants.Endpoints;
import utils.RequestSpecFactory;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;
public class UserDetailsTest extends BaseTest {

    @Test(
            description = "Given valid token when user details API is called then user info is returned"
    )
    public void getUserDetails() {

        Response response =
                given(RequestSpecFactory.authSpec(accessToken))
                        .when()
                        .get(Endpoints.USER_DETAILS)
                        .then()
                        .statusCode(200)
                        .extract().response();

        userId = response.jsonPath().getInt("id");
        assertTrue(userId > 0, "User ID should be valid");
    }
}
