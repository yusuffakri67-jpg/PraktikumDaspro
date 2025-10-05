
import java.util.Scanner;

public class ifCetakKRS19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.println("apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();

        String hasil = (uktlunas) ? "pembayaran UKT terverifikasi\nsilahkan cetak KRS dan minta tanda tangan dosen DPA" : "pembayaran UKT belum terverifikasi\nsilahkan lunasi pembayaran UKT terlebih dahulu";
        System.out.println(hasil);
    }
}