package TugasPraktikum6;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan {
    static Scanner in = new Scanner(System.in);
    
    static int bacaInt() {
        return Integer.parseInt(in.nextLine().trim());
    }

    //SOAL 1
    static void soal1() {
        int[] a = new int[3];            
        a[0] = 3; a[1] = 6; a[3] = 30;
        int[] b = {3, 6, 30};             
        int[] c = new int[]{1, 2, 3};   
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    //SOAL 2
    static void soal2() {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";   // ubah nilai pada indeks yang berisi "Suzuki"
                System.out.println("Indeks ke-" + i + " setelah diubah: " + mobil[i]);
            }
        }
    }

    // SOOAL 3
    static void soal3() {
        System.out.print("Jumlah elemen: ");
        int n = bacaInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr[i] = bacaInt();
        }
        int maks = 0, min = 0, total = 0, jmlGanjil = 0, jmlGenap = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[maks]) maks = i;
            if (arr[i] < arr[min]) min = i;
            total += arr[i];
            if (i % 2 == 1) jmlGanjil += arr[i]; else jmlGenap += arr[i];
        }
        System.out.println("c. Terbesar: " + arr[maks] + " (indeks " + maks + ")");
        System.out.println("   Terkecil: " + arr[min] + " (indeks " + min + ")");
        System.out.println("d. Rata-rata: " + (double) total / n);
        System.out.print("Masukkan digit terakhir NPM: ");
        int npm = bacaInt();
        int hasil;
        if (npm % 2 == 0) {            // NPM genap -> langkah e
            hasil = jmlGanjil;
            System.out.println("e. Jumlah elemen berindeks ganjil: " + hasil);
        } else {                       // NPM ganjil -> langkah f
            hasil = jmlGenap;
            System.out.println("f. Jumlah elemen berindeks genap: " + hasil);
        }
        System.out.println("g. Hasil penjumlahan bernilai " + (hasil % 2 == 0 ? "genap" : "ganjil"));
        Arrays.sort(arr);
        System.out.println("h. Setelah diurutkan: " + Arrays.toString(arr));
    }

    //SOAL 4
    static void soal4() {
        System.out.print("Jumlah mahasiswa: ");
        int n = bacaInt();
        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nama " + (i + 1) + ": ");
            nama[i] = in.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = bacaInt();
            status[i] = nilai[i] <= 50 ? "Tidak Lulus" : "Lulus";
        }
        System.out.println("\n        Daftar Nilai Mahasiswa");
        System.out.printf("%-4s %-15s %-8s %s%n", "No", "Nama", "Nilai", "Status");
        for (int i = 0; i < n; i++)
            System.out.printf("%-4d %-15s %-8d %s%n", i + 1, nama[i], nilai[i], status[i]);
    }

    //SOAL 5
    static void soal5() {
        System.out.print("Jumlah baris: ");
        int b = bacaInt();
        System.out.print("Jumlah kolom: ");
        int k = bacaInt();
        int[][] m1 = new int[b][k], m2 = new int[b][k], hasil = new int[b][k];
        System.out.println("Matriks 1:");
        for (int i = 0; i < b; i++)
            for (int j = 0; j < k; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                m1[i][j] = bacaInt();
            }
        System.out.println("Matriks 2:");
        for (int i = 0; i < b; i++)
            for (int j = 0; j < k; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                m2[i][j] = bacaInt();
            }
        System.out.println("Hasil penjumlahan:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                hasil[i][j] = m1[i][j] + m2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //SOAL 6
    static void soal6() {
        System.out.print("Banyak bilangan: ");
        int n = bacaInt();
        double[] data = new double[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Bilangan ke-" + (i + 1) + ": ");
                String s = in.nextLine();
                try {
                    data[i] = Double.parseDouble(s);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: '" + s + "' bukan bilangan, ulangi!");
                }
            }
            total += data[i];
        }
        System.out.println("Rata-rata: " + total / n);
    }

    // SOAL 7 
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread baru berjalan: " + getName());
        }
    }

    static void soal7() {
        MyThread t = new MyThread();
        t.start();   // memulai eksekusi -> memanggil run()
    }

    // SOAL 8 
    static void soal8() {
        // thread utama = main, thread anak dibuat dengan kode sesingkat mungkin
        new Thread(() -> System.out.println("Halo dari thread anak")).start();
        System.out.println("Halo dari thread utama: " + Thread.currentThread().getName());
    }

    //  SOAL 9 
    static void soal9() {
        int[] age = {12, 4, 5, 2, 6};
        System.out.println("Perulangan for:");
        for (int i = 0; i < age.length; i++) System.out.println(age[i]);
        System.out.println("Perulangan for-each:");
        for (int a : age) System.out.println(a);
    }

    // SOAL 10 
    static void soal10() {
        Object[] data = {19, 0.2, 'C', "Java", true};  // Object menampung semua jenis tipe data
        for (Object o : data)
            System.out.println(o + " (" + o.getClass().getSimpleName() + ")");
    }

    // MENU 
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.print("\nPilih nomor soal (1-10, 0 untuk keluar): ");
            try {
                pilihan = bacaInt();
            } catch (NumberFormatException e) {
                pilihan = -1;
            }
            System.out.println();
            switch (pilihan) {
                case 0: System.out.println("Program selesai."); break;
                case 1: soal1(); break;
                case 2: soal2(); break;
                case 3: soal3(); break;
                case 4: soal4(); break;
                case 5: soal5(); break;
                case 6: soal6(); break;
                case 7: soal7(); break;
                case 8: soal8(); break;
                case 9: soal9(); break;
                case 10: soal10(); break;
                default: System.out.println("Nomor tidak valid");
            }
            try { Thread.sleep(200); } catch (InterruptedException e) { }  // beri waktu thread selesai mencetak
        } while (pilihan != 0);
    }
}

