package joobshet8.joobshet9.joobshet10;
//Nama: Muhammad Yusuf Fakri Fillah
//NIM: 254107020066
//Absen: 29

import java.util.Scanner;

public class CM2Fakri19 {

    static Scanner sc = new Scanner(System.in);
    static String[][] data = new String[100][6];
    static int jumlah = 0;

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah data pendaftar");
            System.out.println("2. Tampilkan semua pendaftar");
            System.out.println("3. Cari pendaftar berdasarkan dosen pembimbing");
            System.out.println("4. Hitung jumlah pendaftar per gelombang");
            System.out.println("5. Mahasiswa dengan jumlah log tertinggi");
            System.out.println("6. Keluar");
            System.out.print("Pilih:");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 ->
                    tambahData();
                case 2 ->
                    tampilkanData();
                case 3 ->
                    cariDosen();
                case 4 ->
                    tampilkanHitungGelombang();
                //modifikasi
                case 5 ->
                    MahasiswaLogTinggi();
                case 6 ->
                    System.out.println("Keluar....");
                default ->
                    System.out.println("Pilihan tidak ada.");
            }
        } while (pilih != 6);
    }

    public static void tambahData() {
        System.out.print("Nama: ");
        data[jumlah][0] = sc.nextLine();
        boolean valid = false;
        while (!valid) {
            System.out.print("NIM (12 angka): ");
            String nim = sc.nextLine();

            if (nim.length() == 12 && nim.matches("\\d{12}")) {
                data[jumlah][1] = nim;
                valid = true;
            } else {
                System.out.println("NIM harus 12 angka! Coba lagi.");
            }
        }
        System.out.print("Judul skripsi: ");
        data[jumlah][2] = sc.nextLine();
        System.out.print("Dosen pembimbing: ");
        data[jumlah][3] = sc.nextLine();

        data[jumlah][4] = String.valueOf(validasiGelombang());
        data[jumlah][5] = String.valueOf(validasiLog());

        jumlah++;
        System.out.println("\nData berhasil disimpan.");
        System.out.println("Total pendaftar saat ini: " + jumlah);

    }

    public static void tampilkanData() {
        if (jumlah == 0) {
            System.out.println("Belum ada data.");
            return;
        }
        System.out.println("\n=== DAFTAR PENDAFTAR UJIAN SKRIPSI ===");
        System.out.printf("%-3s %-12s %-10s %-30s %-18s %-10s %-5s\n",
                "No", "Nama", "NIM", "Judul Skripsi", "Dosen Pembimbing", "Gelombang", "Log");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3d %-12s %-10s %-30s %-18s %-10s %-5s\n",
                (i + 1),
                data[i][0],
                //modifikasi
                potong(data[i][1], 10),
                potong(data[i][2], 30),
                data[i][3],
                data[i][4],
                data[i][5]);
        }
    }

    public static String potong(String text, int batas) {
        if (text.length() <= batas) {
            return text;
        }
        return text.substring(0, batas - 3) + "...";
    }

    public static void cariDosen() {
        System.out.print("Masukkan nama dosen: ");
        String target = sc.nextLine();
        boolean ada = false;

        for (int i = 0; i < jumlah; i++) {
            if (data[i][3].equalsIgnoreCase(target)) {
                System.out.println(data[i][0] + " | " + data[i][1] + " | Gelombang " + data[i][4]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada mahasiswa bimbingan dosen tersebut.");
        }
    }

    public static int validasiGelombang() {
        int g;
        do {
            System.out.print("Gelombang (1/2/3): ");
            g = sc.nextInt();
            if (g < 1 || g > 3) {
                System.out.println("Gelombang salah!");
            }
        } while (g < 1 || g > 3);
        return g;
    }

    public static int validasiLog() {
        int l;
        do {
            System.out.print("Total log bimbingan (min 8): ");
            l = sc.nextInt();
            if (l < 8) {
                System.out.println("Minimal 8!");
            }

        } while (l < 8);
        sc.nextLine();
        return l;
    }

    public static String hitungGelombang() {
        int g1 = 0, g2 = 0, g3 = 0;
        for (int i = 0; i < jumlah; i++) {
            if (data[i][4].equals("1")) {
                g1++;
            } else if (data[i][4].equals("2")) {
                g2++;
            } else {
                g3++;
            }
        }
        return "\n=== LAPORAN PENDAFTAR PER GELOMBANG ===\n"
                + "Gelombang 1: " + g1 + "\n"
                + "Gelombang 2: " + g2 + "\n"
                + "Gelombang 3: " + g3 + "\n";

    }

    public static void tampilkanHitungGelombang() {
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar-");
            return;
        }
        System.out.println(hitungGelombang());
    }
    //modifikasi dan tambahan
    public static void MahasiswaLogTinggi() {
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        int maxLog = Integer.parseInt(data[0][5]);
        String namaMahasiswa = data[0][0];
        String nimMahasiswa = data[0][1];

        for (int i = 1; i < jumlah; i++) {
            int logSaatIni = Integer.parseInt(data[i][5]);
            if (logSaatIni > maxLog) {
                maxLog = logSaatIni;
                namaMahasiswa = data[i][0];
                nimMahasiswa = data[i][1];
            } 
        }

        System.out.println("Mahasiswa dengan jumlah log tertinggi:");
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("NIM: " + nimMahasiswa);
        System.out.println("Jumlah Log: " + maxLog);
    }
}
