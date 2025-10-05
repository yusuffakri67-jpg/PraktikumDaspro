
import java.util.Scanner;

public class ifCetakKRS19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("apakah UKT sudah lunas? (sudah/belum): ");
        String uktlunas = sc.next();
        if (uktlunas.equals("sudah")) {
            System.out.println("pembayaran UKT terverifikasi");
            System.out.println("silahkan cetak KRS dan minta tanda tangan dosen DPA");
        } else {
            System.out.println("maaf, silahkan lunasi UKT terlebih dahulu");
            System.out.println("untuk dapat mencetak KRS");
            System.out.println("setelah UKT lunas, silahkan ulangi proses ini");

            String ajukanKeringanan = sc.next();
            System.out.println("permintaan keringanan (ajukan/ditolak");
            if (ajukanKeringanan.equals("ajukan")) {
                System.out.println("permintaan keringanan UKT diterima");
                System.out.println("permintaan keringanan UKT sedang diproses");
                System.out.println("silahkan tunggu informasi selanjutnya");

            } else {
                System.out.println("maaf, permintaan keringanan UKT ditolak");
                System.out.println("silahkan hubungi bagian keuangan untuk informasi lebih lanjut");
            }

        }
    }
}
