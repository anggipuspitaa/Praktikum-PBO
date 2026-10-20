package tugaspraktikum3;

import java.util.Scanner;

public class SelisihWaktu {

    // Mengubah total detik menjadi teks "x hari, x jam, x menit, x detik"
    static String format(long totalDetik) {
        long hari  = totalDetik / 86400;
        long sisa  = totalDetik % 86400;
        long jam   = sisa / 3600;
        sisa       = sisa % 3600;
        long menit = sisa / 60;
        long detik = sisa % 60;
        return hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Mesin cetak: 1 lembar/detik
        System.out.println("=== Pencetakan Novel Pertama ===");
        System.out.print("Jumlah novel   : ");
        long novel1 = in.nextLong();
        System.out.print("Tebal (lembar) : ");
        long lembar1 = in.nextLong();

        System.out.println("\n=== Pencetakan Novel Kedua ===");
        System.out.print("Jumlah novel   : ");
        long novel2 = in.nextLong();
        System.out.print("Tebal (lembar) : ");
        long lembar2 = in.nextLong();

        long waktu1 = novel1 * lembar1;   // detik
        long waktu2 = novel2 * lembar2;   // detik
        long selisih = Math.abs(waktu1 - waktu2);

        System.out.println("\nWaktu pertama : " + format(waktu1));
        System.out.println("Waktu kedua   : " + format(waktu2));
        System.out.println("Selisih waktu : " + format(selisih));
    }
}