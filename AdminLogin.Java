import javax.swing.*;

public class AdminLogin {
    private JTextField adminLoginTextField;
    private JFormattedTextField usernameFormattedTextField;
    private JPasswordField passwordPasswordField;

    public boolean validateCredentials(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }
}
