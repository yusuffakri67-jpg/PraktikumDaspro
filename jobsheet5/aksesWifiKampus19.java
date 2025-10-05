import java.util.Scanner;
public class aksesWifiKampus19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String jenisPengguna;
        int sks;

        System.out.println("masukkan jenis pengguna (dosen/mahasiswa): ");
        jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("akses wifi diberikan (dosen)");
        }
        else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("masukkan jumlah sks yang diambil: ");
            sks = sc.nextInt();
            if (sks >= 12){
                System.out.println("akses wifi diberikan (mahasiswa aktif)");
            }
            else{
                System.out.println("akses wifi ditolak, SKS kurang dari 12");
            }
        }
        else{
            System.out.println("akses ditolak");
        }
    }
}
