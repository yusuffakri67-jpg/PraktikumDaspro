import java.util.Scanner;
public class KafeDoWhile19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000;
        double hargaTeh = 7000;
        double hargaRoti = 20000;
        
        do {
          System.out.print("masukkan nama pelanggan(ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();

        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("transaksi dibatalkan.");
            break;
        }
                System.out.print("jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("jumlah roti: ");
        roti = sc.nextInt();

        double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp" + totalHarga);
        sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai");
    }
}