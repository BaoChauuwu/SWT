package chaudnb.example;

public class AccountService {

    public boolean registerAccount(String username, String password, String email) {
        return isValidUsername(username)
                && isValidPassword(password)
                && isValidEmail(email);
    }

    private boolean isValidUsername(String username) {
        return username != null && !username.isBlank();
    }

    public boolean isValidPassword(String password) {
        return password != null && password.length() > 6;
    }

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }
}
