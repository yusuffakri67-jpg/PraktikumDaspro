package joobshet8;
import java.util.Scanner;
public class tugasJoobshet8No19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Perulangan luar untuk setiap nilai n
        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

            // Perulangan dalam untuk menghitung dan menampilkan kuadrat
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}
