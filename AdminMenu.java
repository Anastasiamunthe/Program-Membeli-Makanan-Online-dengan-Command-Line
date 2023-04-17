import java.util.Scanner;
public class Admin {
    public static void adminMenu() {
        System.out.println("Selamat datang, Admin!!!");
        System.out.println("Silahkan pilih menu : ");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali ke halaman Login");

        Scanner pilihMenuAdmin = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = pilihMenuAdmin.nextInt();

        switch (pilihan) {
            case 1:
                DaftarRestoran daftar = new DaftarRestoran();
                daftar.Restoran();
                break;
            case 2:
                TambahRestoran tambah = new TambahRestoran();
                tambah.Tambahkan();
                break;
            case 3:
                HapusRestoran hapus = new HapusRestoran();
                hapus.Menghapus();
                break;
            case 4:
                Main.main(new String[]{});
                break;
            default:
                System.out.println("Silahkan masukkan pilihan yang tersedia");
                break;


        }

    }
}
