package messengerClient;

import java.util.List;

public class User {

    private static User instance = null;


    private User() {

    }

    public static synchronized User getInstance() {
        if (instance == null)
            instance = new User();
        return instance;
    }


    private String login = null;
    private String passwd = null;
    private String token = null;
    private String avatar = null;
    private List<Integer> chats = null;

    public static void setInstance(User instance) {
        User.instance = instance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Integer> getChats() {
        return chats;
    }

    public void setChats(List<Integer> chats) {
        this.chats = chats;
    }
}
