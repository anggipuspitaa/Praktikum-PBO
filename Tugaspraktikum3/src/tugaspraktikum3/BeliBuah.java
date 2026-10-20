
package tugaspraktikum3;
import java.io.*;

public class BeliBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah mangga dibeli (pcs)        : ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.print("Jumlah tetangga                   : ");
        int tetangga = Integer.parseInt(br.readLine());
        System.out.print("Jambu per tetangga (pcs)          : ");
        int jambuPerOrang = Integer.parseInt(br.readLine());
        System.out.print("Mangga busuk dikembalikan (pcs)   : ");
        int busuk = Integer.parseInt(br.readLine());

        int jambu = tetangga * jambuPerOrang;
        int mangaBersih = mangga - busuk;
        int total = mangaBersih + jambu;

        System.out.println("\nMangga dibeli (setelah retur) : " + mangaBersih + " pcs");
        System.out.println("Jambu dibeli                  : " + jambu + " pcs");
        System.out.println("Total buah yang dibeli        : " + total + " pcs");
    }
}

