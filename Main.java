import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Selamat datang di layanan pesan online ===");
        System.out.println("===            MARI MAKAN        ===");
        System.out.println(" ");
        System.out.println("Login Sebagai :");
        System.out.println("1. Admin");
        System.out.println("2. Customer");

        System.out.print("Masukkan Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        System.out.print("Username: ");
        String username = scanner.next();

        System.out.print("Password: ");
        String password = scanner.next();

        if (pilihan == 1) {
            AdminLogin adminLogin = new AdminLogin();
            if (adminLogin.validateCredentials(username, password)) {
                System.out.println("Login sukses! Anda masuk sebagai admin.");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            CustomerLogin customerLogin = new CustomerLogin();
            if (customerLogin.validateCredentials(username, password)) {
                System.out.println("Login sukses! Anda masuk sebagai customer.");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
