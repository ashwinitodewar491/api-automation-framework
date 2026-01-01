package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;
public class RequestSpecFactory {
    public static RequestSpecification defaultSpec() {
        return new RequestSpecBuilder()
                .setContentType(JSON)
                .log(io.restassured.filter.log.LogDetail.ALL)
                .build();
    }

    public static RequestSpecification authSpec(String token) {
        return new RequestSpecBuilder()
                .setContentType(JSON)
                .addHeader("Authorization", "Bearer " + token)
                .log(io.restassured.filter.log.LogDetail.ALL)
                .build();
    }
}
