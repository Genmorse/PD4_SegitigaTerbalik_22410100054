package LatihanLoop;

public class Latihan1 {
    public static void main(String[] args) {
        //mencetak angka 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //mencetak kata i love u sebanyak 100x
        for (int i = 1; i < 101; i++) {
            System.out.println("i love u");
        }

        //tidak terhingga (infinite loop)
        for (int i = 1; i < 101; i++) {
            System.out.println("i love u");

        }

        //mencetak penjumlahan angka dari 1-10 (1+2+3+4+5...+10)
        int n = 11;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1; //(sum = sum+1)

        }
        //cetak hasil akhir penjumlahan (di luar for)
        System.out.println("hasil" + sum);

        //coba penjumlahan 10+9+8+7+6+5+4+3+2+1
        //cara
        int x = 10, s = 0;
        for (int i = x; i > 0; i--) {
            s += i; //(sum = sum+1)
        }
        System.out.println(s);
    }
}

