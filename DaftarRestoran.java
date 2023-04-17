import java.util.Scanner;

public class DaftarRestoran {
    public enum UserType {
        Admin,
        Customer,
    }

    public static void Restoran() {
        System.out.println("1. Restoran Padang");
        System.out.println("2. Restoran Casino");
        System.out.println("3. Hoodali Resto");
        System.out.println("4. Family Resto");
        System.out.println("5. Kembali");


        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                RestoranPadang restoranpadang = new RestoranPadang();
                restoranpadang.ProfilRestoranPadang();
                break;
            case 2:
                RestoranCasino restorancasino = new RestoranCasino();
                restorancasino.ProfilRestoranCasino();
                break;
            case 3:
                HoodaliResto restoranhoodali = new HoodaliResto();
                restoranhoodali.ProfilHoodaliResto();
                break;
            case 4:
                FamilyResto restoranfamily = new FamilyResto();
                restoranfamily.ProfilFamilyResto();
                break;
            case 5:
                Main.main(new String[]{});
                break;
            default:
                System.out.println("Masukkan Pilihan Yang Tersedia");
                break;
        }




    }
}
