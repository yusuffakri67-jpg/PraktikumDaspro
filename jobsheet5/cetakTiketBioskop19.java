import java.util.Scanner;
public class cetakTiketBioskop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaFilm;
        int jumlahTiket;
        double hargaTiket = 50000;
        double totalHarga;
        double beli4Tiket = hargaTiket * 0.10;
        double beli10Tiket = hargaTiket * 0.15;

        do {
            System.out.print("Masukkan nama film: ");
            namaFilm = sc.nextLine();
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            totalHarga = jumlahTiket * hargaTiket * (jumlahTiket >= 4 ? 0.10 : (jumlahTiket >= 10 ? 0.15 : 1.0));
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket harus lebih dari 0. Silakan coba lagi.");
                sc.nextLine();
                continue;
            }
            System.out.println("Tiket untuk film " + namaFilm + " berhasil dipesan.");
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
        } while (true);
    }
}