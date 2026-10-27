package p3;

import java.io.*;
import java.util.Scanner;

/*
 PERBEDAAN Scanner dan BufferedReader:
 1. Scanner bisa langsung mem-parsing tipe data (nextInt, nextDouble, dll),
    BufferedReader hanya membaca String (readLine) sehingga harus dikonversi
    manual (Integer.parseInt, dll).
 2. BufferedReader memakai buffer lebih besar (8192 karakter) dan lebih cepat
    untuk input besar; Scanner lebih lambat karena memakai regex.
 3. BufferedReader bersifat synchronized (aman untuk thread), Scanner tidak.
 4. BufferedReader melempar IOException sehingga wajib di-handle,
    Scanner tidak (unchecked).
 5. Scanner bisa memakai delimiter/pola tertentu, BufferedReader tidak.
*/
public class Scannervsbufferedreader {

    public static void main(String[] args) throws IOException {
        // ===== Menggunakan Scanner =====
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan nama : ");
        String nama1 = sc.nextLine();
        System.out.print("[Scanner] Masukkan umur : ");
        int umur1 = sc.nextInt();            // langsung bertipe int
        System.out.println("Hasil Scanner          : " + nama1 + ", " + umur1);

        System.out.println();

        // ===== Menggunakan BufferedReader =====
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan nama : ");
        String nama2 = br.readLine();
        System.out.print("[BufferedReader] Masukkan umur : ");
        int umur2 = Integer.parseInt(br.readLine()); // harus dikonversi manual
        System.out.println("Hasil BufferedReader          : " + nama2 + ", " + umur2);
    }
}