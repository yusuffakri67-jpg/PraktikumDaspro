// Nama: Muhammad Yusuf Fakri Fillah
// NIM: 254107020066
// Absen: 29


import java.util.Scanner;
public class RemidiDaspro19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Array 1 dimensi untuk menyimpan 5 nilai ujian
        double[] nilai = new double[5];

        // Loop untuk memasukkan 5 nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            // validasi input agar berupa angka
            while (!sc.hasNextDouble()) {
                System.out.print("Input tidak valid. Masukkan angka: ");
                sc.next();
            }
            double v = sc.nextDouble();
            // optional: validasi rentang nilai (0-100)
            if (v < 0 || v > 100) {
                System.out.println("Nilai harus antara 0 dan 100. Ulangi input.");
                i--; // ulangi index ini
                continue;
            }
            nilai[i] = v;
        }

        sc.close();

        // Hitung rata-rata menggunakan fungsi
        double rata = hitungRata(nilai);

        // Tampilkan hasil
        System.out.printf("Rata-rata nilai: %.2f\n", rata);
        if (rata >= 72.5) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak lulus");
        }
    }


    // Fungsi untuk menghitung rata-rata dari array nilai
    public static double hitungRata(double[] arr) {
        double jumlah = 0;
        for (double v : arr) {
            jumlah += v;
        }
        return jumlah / arr.length;
    }
}