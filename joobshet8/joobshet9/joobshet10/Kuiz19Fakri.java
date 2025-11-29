package joobshet8.joobshet9.joobshet10;
//Nama: Muhammad Yusuf Fakri Fillah
//NIM: 254107020066
//Absen: 19
public class Kuiz19Fakri {
    public static void main(String[] args) {
 String[] days = {"Senin", "Sabtu", "Minggu"};
        // Penjualan buku Anak-anak: Senin=3, Sabtu=5, Minggu=4
        int[] penjualanAnakAnak = {3, 5, 4};
        int hargaAnakAnak = 35000;
        
        // Total penjualan (semua hari)
        int totalUnit = 0;
        for (int unit : penjualanAnakAnak) totalUnit += unit;
        
        // Total pemasukan hari Senin
        int idxhari = 0;
        long pemasukkanSenin = (long) penjualanAnakAnak[idxhari] * hargaAnakAnak;
        
        // Output
        System.out.println("=== PENJUALAN BUKU ANAK-ANAK ===\n");
        System.out.println("Harga per unit: Rp " + String.format("%,d", hargaAnakAnak));
        System.out.println("Penjualan per hari:");
        for (int i = 0; i < days.length; i++) {
            long pendapatan = (long) penjualanAnakAnak[i] * hargaAnakAnak;
            System.out.printf("  %s: %d unit = Rp %,d\n", days[i], penjualanAnakAnak[i], pendapatan);
        }
        System.out.println("\nTotal penjualan (3 hari): " + totalUnit + " unit");
        System.out.printf("Total penjualan hari Senin: %d unit = Rp %,d\n", penjualanAnakAnak[idxhari], pemasukkanSenin);
    }
}
