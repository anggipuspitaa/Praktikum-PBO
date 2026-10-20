
package tugaspraktikum3;
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.print("Nomor Induk Karyawan : ");
        String npm = in.nextLine();
        System.out.print("Nama Karyawan        : ");
        String nama = in.nextLine();
        System.out.print("Alamat               : ");
        String alamat = in.nextLine();
        System.out.print("Jabatan              : ");
        String jabatan = in.nextLine();
        System.out.print("Gaji Pokok           : ");
        double p1 = in.nextDouble();
        System.out.print("Tunjangan Jabatan    : ");
        double p2 = in.nextDouble();
        System.out.print("Tunjangan Istri      : ");
        double p3 = in.nextDouble();
        System.out.print("Tunjangan Anak       : ");
        double p4 = in.nextDouble();
 
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;
 
        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("Nomor Induk Karyawan : " + npm);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : " + p1);
        System.out.println("Tunjangan Jabatan    : " + p2);
        System.out.println("Tunjangan Istri      : " + p3);
        System.out.println("Tunjangan Anak       : " + p4);
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajak);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    }
}
    
