import java.util.Scanner;
import DaftarRestoran;

public class AdminMenu {
    public static void main(String[] args) {


        System.out.println("Selamat Datang di Menu Admin");
        System.out.println("1. Daftar Restoran");
        System.out.println("2. Tambahkan Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                DaftarRestoran();
                break;
            case 2:
                System.out.println("Anda memilih Tambahkan Restoran");
                break;
            case 3:
                System.out.println("Anda memilih Hapus Restoran");
                break;
            case 4:
                System.out.println("Anda memilih Kembali");
                break;
            default:
                System.out.println("Pilihan Yang Anda Masukkan Tidak Tersedia");
        }
    }
}
