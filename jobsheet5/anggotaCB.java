import java.util.Scanner;
public class anggotaCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String alamat;
        String noTelepon;

        do {
            System.out.print("Masukkan nama anggota: ");
            nama = sc.nextLine();
            System.out.print("Masukkan alamat anggota: ");
            alamat = sc.nextLine();
            System.out.print("Masukkan no telepon anggota: ");
            noTelepon = sc.nextLine();

            System.out.println("\n--- Data Anggota ---");
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("No Telepon: " + noTelepon);
            System.out.println("----------------------\n");

        } while (true);
    }
}
