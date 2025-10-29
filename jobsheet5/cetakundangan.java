import java.util.Scanner;
public class cetakundangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaAcara;
        String tanggalAcara;
        String lokasiAcara;

        do {
            System.out.print("Masukkan nama acara: ");
            namaAcara = sc.nextLine();
            System.out.print("Masukkan tanggal acara (dd-mm-yyyy): ");
            tanggalAcara = sc.nextLine();
            System.out.print("Masukkan lokasi acara: ");
            lokasiAcara = sc.nextLine();

            System.out.println("\n--- Undangan Acara ---");
            System.out.println("Anda diundang untuk menghadiri acara: " + namaAcara);
            System.out.println("Tanggal: " + tanggalAcara);
            System.out.println("Lokasi: " + lokasiAcara);
            System.out.println("----------------------\n");

        } while (true);
    }
}
