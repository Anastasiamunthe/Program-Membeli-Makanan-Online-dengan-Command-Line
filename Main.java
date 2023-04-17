import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("===== SELAMAT DATANG DI CARI MAKAN ====== ");
        System.out.println("=====     Layanan Pesan Online     ====== ");
        System.out.println(" ");
        System.out.println("1. Login Sebagai Admin ");
        System.out.println("2. Login Sebagai Costumer");

        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println("Silahkan Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                AdminLogin Admin = new AdminLogin();
                Admin.admin();
                break;
            case 2:
                CostumerLogin Costumer = new CostumerLogin();
                Costumer.costumer();
                break;
            default:
                System.out.println("Silahkan masukkan pilihan yang tersedia");
        }

    }

  }
