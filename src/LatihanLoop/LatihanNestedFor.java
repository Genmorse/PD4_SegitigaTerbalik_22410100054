package LatihanLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanNestedFor {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
//
//        //varibel
//        int minggu, hari;
//
//        //input
//        System.out.println("Jumlah Minggu : ");
//        minggu = Integer.parseInt(br.readLine());
//        System.out.print("Jumlah hari : ");
//        hari = Integer.parseInt(br.readLine());
//
//        //perulangan + output
//        //outer loop: baris
//        for (int i = 1; i <= minggu; i++) {
//            System.out.println("Minggu ke - " + i);
//
//            //inner loop: kolom
//            for (int j = 1; j <= hari ; j++) {
//                //jika tidak ada hari yang ditampilkan pada minggu ke-4
//                if (i==4) {
//                    break;
//                }
//                System.out.println("Hari : " + j);
//            }
//
        //patern
        int n = 5; //jumlah baris
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }


        }

        //tanpa inputan
        //baris 4
        for (int k = 0; k < 4; k++) {
            System.out.println();
            //kolom 4
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //patern segitiga terbalik
    }
}

