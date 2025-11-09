package joobshet8;
import java.util.Scanner;
public class tugasNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jmlCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            int totalItemCabang = 0;
            int jumlahPelangganCabang = 0;

            int pelanggan = 1;
            while (true) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? (0 untuk berhenti): ");
                int item = sc.nextInt();

                if (item == 0) {
                    break; // berhenti input pelanggan untuk cabang ini
                }

                totalItemCabang += item;
                jumlahPelangganCabang++;
                pelanggan++;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelangganCabang + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelangganSemua += jumlahPelangganCabang;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("Item terjual: " + totalItemSemua + " item");
    }
}
