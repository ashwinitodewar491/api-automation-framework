package user;

import common.BaseTest;
import constants.Endpoints;
import utils.RequestSpecFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UserTodosList extends BaseTest {
    @Test(
            description = "Given userId when todos API is called then todo list is returned"
    )
    public void getUserTodos() {

        given(RequestSpecFactory.authSpec(accessToken))
                .when()
                .get(String.format(Endpoints.USER_TODOS, userId))
                .then()
                .statusCode(200)
                .log().all();
    }
}
