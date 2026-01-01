package constants;

public class Endpoints {
    public static final String LOGIN = "/auth/login";
    public static final String USER_DETAILS = "/auth/me";
    public static final String USER_TODOS = "/users/%d/todos";

    private Endpoints() {
        // prevent instantiation
    }
}
