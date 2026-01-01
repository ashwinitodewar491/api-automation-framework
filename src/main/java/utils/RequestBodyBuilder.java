package utils;

import java.util.HashMap;
import java.util.Map;
import config.EnvConfig;

public class RequestBodyBuilder {
    /**
     * Creates login request payload
     *
     * @return Map containing login request body
     */
    public static Map<String, Object> createLoginBody() {

        Map<String, Object> body = new HashMap<>();

        body.put("username", EnvConfig.get("LOGIN_USERNAME"));
        body.put("password", EnvConfig.get("LOGIN_PASSWORD"));
        body.put("expiresInMins", 30);

        return body;
    }


}
