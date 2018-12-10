package ua.edu.lnu.financial.exceptions;

public class App {
    private static String LOGIN_REG_EXP = "^[a-zA-Z0-9]+$";
    private static String PASSWORD_REG_EXP = "^[a-zA-Z0-9_]+$";
    private static int MAX_LOGIN_LENGTH = 20;
    private static int MAX_PASSWORD_LENGTH = 20;

    private static boolean isLoginCorrect(final String login) {
        boolean result = false;
        if (login.matches(LOGIN_REG_EXP) && login.length() < MAX_LOGIN_LENGTH) {
            result = true;
        }
        return result;
    }

    private static boolean isPasswordCorrect(final String password) {
        boolean result = false;
        if (password.matches(PASSWORD_REG_EXP) && password.length() < MAX_PASSWORD_LENGTH) {
            result = true;
        }
        return result;
    }

    private static boolean authenticate(final String login, final String password, final String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!isLoginCorrect(login)) {
            throw new WrongLoginException("Incorrect login");
        }
        if (!isPasswordCorrect(password)) {
            throw new WrongPasswordException("Incorrect password");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password confirmation");
        }
        return true;
    }

    public static void main(String[] args) {
        String login = "jhasjd2343!43kj";
        String password = "jhasjd2343__43kj";
        String confirmPassword = "jhasjd2343__43kj";
        boolean isAuthenticated = false;
        try {
            isAuthenticated = authenticate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException we) {
            we.printStackTrace();
        }
        if (isAuthenticated){
            System.out.println("User was authenticated successfully!");
        } else {
            System.out.println("Wrong authentication!");
        }
    }
}
