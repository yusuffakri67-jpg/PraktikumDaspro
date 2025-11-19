package joobshet8.joobshet9;

import java.util.Scanner;

public class ArrayRataNilai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[3];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                nilaiMhs[i] = sc.nextInt();
                if (nilaiMhs[i] > 100) {
                    System.out.println("Nilai tidak boleh lebih dari 100! Silakan input ulang");
                } else if (nilaiMhs[i] < 0) {
                    System.out.println("Nilai tidak boleh negatif! Silakan input ulang");
                } else {
                    valid = true;
                }
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >= 70){
                System.out.println("mahasiswa ke-"+(i+1)+" lulus! ");
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                System.out.println("mahasiswa ke-"+(i+1)+" tidak lulus");
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        double rataLulus = (countLulus > 0) ? totalLulus / countLulus : 0;
        double rataTidakLulus = (countTidakLulus > 0) ? totalTidakLulus / countTidakLulus : 0;
        
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Rata-Rata nilai LULUS = " + rataLulus);
        System.out.println("Rata-Rata nilai TIDAK LULUS = " + rataTidakLulus);
    }
}
