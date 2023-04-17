import java.util.Scanner;

public class CostumerLogin {
    public void costumer() {
        System.out.println("Anda Memilih Login Sebagai Costumer");
        Scanner scanner = new Scanner(System.in);
        String username, password;
        System.out.println("Masukkan Username :");
        username = scanner.nextLine();
        System.out.println("Masukkan Password :");
        password = scanner.nextLine();

        if (username.equals("customer") && password.equals("customer123")) {
            Customer costumer = new Customer();
            costumer.costumerMenu();
        } else {
            System.out.println("Username Atau Password Salah");
        }
    }
}
