package joobshet8;
import java.util.Scanner;
public class tugasNo2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        System.out.println("\nPola persegi angka bolong:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Cetak angka hanya di tepi
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
