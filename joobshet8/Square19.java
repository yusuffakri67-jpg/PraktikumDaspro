package PraktikumDaspro.joobshet8;

import java.util.Scanner;
public class Square19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai n = ");
        int N = sc.nextInt();

        for (int iOuter = 0; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
