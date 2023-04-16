public class CustomerLogin {
    public boolean validateCredentials(String username, String password) {
        return username.equals("customer") && password.equals("customer123");
    }
}
