import java.util.Scanner;
public class biayaParkir19 {
    public static void main(String[] args) {
        // untuk mendeklarasikan
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        String jenisKendaraan;
        int durasi;
        int total = 0;

        System.out.println("======================");
        System.out.println("PROGRAM PARKIR");
        System.out.println("======================");

        do {
            System.out.print("Pilih Jenis Kendaraan mobil/Motor, (inputkan 'selesai' untuk keluar dari program): ");
            jenisKendaraan = sc.next().toLowerCase(); // mengubah ke huruf kecil agar mudah divalidasi

            if (jenisKendaraan.equals("selesai")) {
                System.out.println("Program Selesai. Menghitung Total pembayaran...");
                break;
            }

            if (!jenisKendaraan.equals("mobil") && !jenisKendaraan.equals("motor")) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi.");
                continue;
            }

            // durasi parkir
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            // Validasi durasi parkir
            if (durasi <= 0) {
                System.out.println("Durasi parkir tidak valid! Masukkan angka lebih dari 0.");
                continue;
            }

            int biaya = 0;

            // tarif parkir(durasi dan jenis kendaraan)
            if (durasi > 5) {
                biaya = 12500; // Tarif tetap jika durasi parkir lebih dari 5 jam
            } else if (jenisKendaraan.equals("mobil")) {
                biaya = durasi * 3000; // Tarif mobil/jam
            } else if (jenisKendaraan.equals("motor")) {
                biaya = durasi * 2000; // Tarif motor/jam
            }

            total = total + biaya;

            System.out.println("Biaya parkir " + jenisKendaraan + " adalah : Rp " + biaya);
        } while (true);

        System.out.println("=============================");
        System.out.println("Total Penghasilan Parkir: Rp " + total);
        System.out.println("=============================");


    }
}