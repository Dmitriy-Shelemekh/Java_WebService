package accounts;

/**
 * Created by Dmitry Shelemekh on 09.01.2018.
 */
public class UserProfile {
    private final String login;
    private final String pass;

    public UserProfile(String login) {
        this.login = login;
        this.pass = login;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }
}