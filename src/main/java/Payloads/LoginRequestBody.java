package Payloads;

import config.EnvConfig;

import java.util.Map;
public class LoginRequestBody {
    public static Map<String, Object> createLoginBody() {
        return Map.of(
                "username", EnvConfig.get("LOGIN_USERNAME"),
                "password", EnvConfig.get("LOGIN_PASSWORD"),
                "expiresInMins", 30
        );
    }
}
