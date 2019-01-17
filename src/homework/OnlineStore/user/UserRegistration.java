package homework.OnlineStore.user;

import homework.OnlineStore.user.User;

import static homework.OnlineStore.user.User.inputString;

public class UserRegistration {

    public static User getUserRegistration() {
        return new User(getLogin(), getPassword());
    }

    private static String getLogin() {
        String login;
        System.out.println("Введите логин: ");
        login = inputString();
        return login;
    }

    private static String getPassword() {
        String password;
        System.out.println("Введите пароль: ");
        password = inputString();
        return password;
    }
}
