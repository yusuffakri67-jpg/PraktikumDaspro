package joobshet8.joobshet9.joobshet10;

import java.util.Scanner;

public class implementasiFlowchart19 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;

        int[][] survey = new int[responden][pertanyaan];

        // Input data survei
        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Rata-rata tiap responden
        System.out.println("Rata-rata tiap responden:");
        for (int i = 0; i < responden; i++) {
            int total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / pertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        // Rata-rata tiap pertanyaan
        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < responden; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / responden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        // Rata-rata keseluruhan
        int totalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataTotal = (double) totalSemua / (responden * pertanyaan);
        System.out.println("\nRata-rata keseluruhan: " + rataTotal);

        sc.close();
    }
}
