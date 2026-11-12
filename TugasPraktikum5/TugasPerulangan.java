
package tugas5perulangan;
import java.util.Scanner;
public class TugasPerulangan {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== LATIHAN PERULANGAN ===");
            System.out.println("1. Terbesar & terkecil dari 10 bilangan");
            System.out.println("2. Jumlah & rata-rata");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Angka ganjil & total");
            System.out.println("5. Half & Full Triangle");
            System.out.println("6. Isi bagian rumpang (angka 11 dua kali)");
            System.out.println("7. Perbedaan i++ dan ++i (while)");
            System.out.println("8. Foreach array");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal: ");
            pilih = in.nextInt();
            System.out.println();

            switch (pilih) {
                case 1 -> soal1();
                case 2 -> soal2();
                case 3 -> soal3();
                case 4 -> soal4();
                case 5 -> soal5();
                case 6 -> soal6();
                case 7 -> soal7();
                case 8 -> soal8();
                case 0 -> System.out.println("Selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }

    // 1. Input 10 bilangan, tentukan terbesar dan terkecil
    static void soal1() {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            int x = in.nextInt();
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Bilangan terbesar : " + max);
        System.out.println("Bilangan terkecil : " + min);
    }

    // 2. Jumlah bilangan ditentukan user, hitung total dan rata-rata
    static void soal2() {
        System.out.print("Jumlah bilangan yang akan dimasukkan : ");
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            total += in.nextInt();
        }
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + (double) total / n);
    }

    // 3. Floyd's Triangle
    static void soal3() {
        System.out.print("Masukkan banyak baris : ");
        int baris = in.nextInt();
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka++ + " ");
            }
            System.out.println();
        }
    }

    // 4. Angka ganjil sebanyak n, lalu jumlahkan
    static void soal4() {
        System.out.print("Masukkan banyak angka : ");
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int ganjil = 2 * i - 1;
            System.out.print(ganjil + " ");
            total += ganjil;
        }
        System.out.println("\nTotal penjumlahan : " + total);
    }

    // 5. Half Triangle dan Full Triangle
    static void soal5() {
        System.out.println("Half Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nFull Triangle");
        for (int i = 1; i <= 5; i++) {
            int k = (i <= 3) ? i : 6 - i; // 1,2,3,2,1
            for (int s = 1; s <= 3 - k; s++) System.out.print(" ");
            for (int j = 1; j <= 2 * k - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 6. Bagian rumpang: tampilkan angka 11 sebanyak dua kali
    static void soal6() {
        for (int i = 0; i < 10; i++) {
            if (i < 2) {
                System.out.println(11);
            }
        }
    }

    // 7. Perbedaan i++ dan ++i pada while
    static void soal7() {
        int i = 0;
        System.out.print("Dengan i++ : ");
        while (i++ < 3) {
            System.out.print(i + " "); // 1 2 3
        }

        int j = 0;
        System.out.print("\nDengan ++j : ");
        while (++j < 3) {
            System.out.print(j + " "); // 1 2
        }
        System.out.println();
    }

    // 8. Foreach untuk menampilkan isi array
    static void soal8() {
        int[] data = {10, 20, 30, 40, 50};
        for (int nilai : data) {
            System.out.println(nilai);
        }
    }
}

