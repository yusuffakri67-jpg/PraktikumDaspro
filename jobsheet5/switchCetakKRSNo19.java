import java.util.Scanner;
public class switchCetakKRSNo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pesan;
        
        System.out.println("apakah mahasiswa sudah bebas kompen? (ya/tidak):");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("masukkan jumlah log bimbingan yang diambil 1: ");
        int logBimbinganP1 = sc.nextInt();

        System.out.println("masukkan jumlah log bimbingan yang diambil 2: ");
        int logbimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")){
            if (logBimbinganP1 >= 8 && logbimbinganP2 >= 4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }
            else if (logBimbinganP1 < 8 && logbimbinganP2 < 4){
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }
            else if(logBimbinganP1 < 8){
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            }
            else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        }
        else{
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}