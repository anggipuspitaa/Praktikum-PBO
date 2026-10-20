package tugaspraktikum3;
import java.io.*;
import java.util.Scanner;

public class Belanja {
    // Membaca angka; titik atau koma desimal sama-sama diterima
    static double bacaAngka(Scanner in, String label) {
        while (true) {
            System.out.print(label);
            String s = in.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka, coba lagi!");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String file = "belanja.dat";

        System.out.print("Nama          : ");
        String nama = in.nextLine();
        double totalBelanja = bacaAngka(in, "Total Belanja : ");
        double diskon = bacaAngka(in, "Diskon (%)    : ");
        double bayar = bacaAngka(in, "Bayar         : ");

        // Menulis data ke file dengan DataOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(bayar);
        dos.close();

        // Membaca data dari file dengan DataInputStream
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        String n = dis.readUTF();
        double belanja = dis.readDouble();
        double d = dis.readDouble();
        double b = dis.readDouble();
        dis.close();

        double total = belanja - (belanja * d / 100);
        double kembali = b - total;

        System.out.println("\n===== STRUK =====");
        System.out.println("Nama          : " + n);
        System.out.println("Total Belanja : " + belanja);
        System.out.println("Diskon (%)    : " + d);
        System.out.println("Total         : " + total);
        System.out.println("Bayar         : " + b);
        System.out.println("Kembalian     : " + kembali);
    }
}