package Tugas4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SegitgaTerbalik {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //mencetak hasil akhir segitiga
        System.out.print("Masukkan Jumlah Segitiga: ");
        int n = 5;
        for (int i = 5; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
