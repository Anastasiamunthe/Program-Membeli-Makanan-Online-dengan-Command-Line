import java.util.Scanner;

public class AdminLogin {
    public void admin() {
        System.out.println("Anda Memilih Login Sebagai Admin");
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.println("Masukkan Username :");
        username =scanner.nextLine();
        System.out.println("Masukkan Password :");
        password =scanner.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            Admin admin = new Admin();
            Admin.adminMenu();
        }else {
            System.out.println("Username Atau Password Salah");
        }
    }
}
