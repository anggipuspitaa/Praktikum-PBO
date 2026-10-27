package tugaspraktikum4;
import java.util.Locale;
import java.util.Scanner;
 
public class StrukturKontrol {
 
    
    static String rp(double angka) {
        return "Rp" + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", angka);
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Perhitungan p = new Perhitungan();
 
        int pilihan;
        do {
            System.out.println("\n=== LATIHAN PRAKTIKUM STRUKTUR KONTROL ===");
            System.out.println("1. Genap / Ganjil");
            System.out.println("2. Kode Hari");
            System.out.println("3. Gaji Bersih Karyawan");
            System.out.println("4. Tahun Kabisat");
            System.out.println("5. Pendapatan Salesman");
            System.out.println("6. Kasir Sederhana");
            System.out.println("7. Luas Bangun Datar");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal : ");
            pilihan = s.nextInt();
            System.out.println();
 
            switch (pilihan) {
 
                // Soal 1
                case 1:
                    System.out.print("Masukkan bilangan : ");
                    p.bilangan = s.nextInt();
                    if (p.isGenap()) {
                        System.out.println(p.bilangan + " adalah bilangan GENAP");
                    } else {
                        System.out.println(p.bilangan + " adalah bilangan GANJIL");
                    }
                    break;
 
                // Soal 2 
                case 2:
                    System.out.print("Masukkan kode hari (1-7) : ");
                    p.kodeHari = s.nextInt();
                    if (p.getNamaHari().equals("")) {
                        System.out.println("Kode hari tidak valid!");
                    } else {
                        System.out.println("Kode " + p.kodeHari + " adalah hari " + p.getNamaHari());
                    }
                    break;
 
                // Soal 3 
                case 3:
                    System.out.print("NIK                 : ");
                    p.nik = s.nextInt();
                    s.nextLine();
                    System.out.print("Nama                : ");
                    p.nama = s.nextLine();
                    System.out.print("Kode golongan (1-4) : ");
                    p.kodeGolongan = s.nextInt();
                    s.nextLine();
                    System.out.print("Status pernikahan (Menikah/Belum menikah/Cerai) : ");
                    p.statusNikah = s.nextLine();
                   
                    
                    if (p.kodeGolongan == 4) {
                        System.out.print("Jumlah anak         : ");
                        p.jumlahAnak = s.nextInt();
                    }
 
                    if (p.hitungGaji()) {
                        System.out.println("\n===== SLIP GAJI =====");
                        System.out.println("NIK                : " + p.nik);
                        System.out.println("Nama               : " + p.nama);
                        System.out.println("Status             : " + p.statusNikah);
                        System.out.println("Jumlah anak        : " + p.jumlahAnak);
                        System.out.println("Gaji pokok         : " + rp(p.gajiPokok));
                        System.out.println("Tunjangan pasangan : " + rp(p.tunjanganPasangan));
                        System.out.println("Tunjangan anak     : " + rp(p.tunjanganAnak));
                        System.out.println("Gaji bersih        : " + rp(p.gajiBersih));
                    } else {
                        System.out.println("Kode golongan tidak valid!");
                    }
                    break;
 
                //  Soal 4 
                case 4:
                    System.out.print("Masukkan tahun : ");
                    p.tahun = s.nextInt();
                    if (p.isKabisat()) {
                        System.out.println(p.tahun + " adalah TAHUN KABISAT");
                    } else {
                        System.out.println(p.tahun + " BUKAN tahun kabisat");
                    }
                    break;
 
                //  Soal 5 
                case 5:
                    System.out.print("Total penjualan hari ini (Rp) : ");
                    p.penjualan = s.nextDouble();
                    p.hitungPendapatan();
                    System.out.println("Uang jasa  : " + rp(p.uangJasa));
                    System.out.println("Komisi     : " + rp(p.komisi));
                    System.out.println("Pendapatan : " + rp(p.pendapatan));
                    break;
 
                //  Soal 6 
                case 6:
                    System.out.print("Apakah memiliki kartu member? (y/n) : ");
                    p.member = s.next().equalsIgnoreCase("y");
                    System.out.print("Total belanja (Rp)       : ");
                    p.totalBelanja = s.nextDouble();
                    System.out.print("Uang yang diberikan (Rp) : ");
                    p.uangBayar = s.nextDouble();
 
                    p.hitungKasir();
                    System.out.println("\nTotal belanja : " + rp(p.totalBelanja));
                    System.out.println("Diskon        : " + rp(p.diskon));
                    System.out.println("Total bayar   : " + rp(p.totalBayar));
                    if (p.kembalian >= 0) {
                        System.out.println("Uang diberikan: " + rp(p.uangBayar));
                        System.out.println("Kembalian     : " + rp(p.kembalian));
                    } else {
                        System.out.println("Uang kurang   : " + rp(-p.kembalian));
                    }
                    break;
 
                // Soal 7 
                case 7:
                    System.out.println("===== MENU LUAS BANGUN DATAR =====");
                    System.out.println("1. Luas Persegi");
                    System.out.println("2. Luas Segitiga");
                    System.out.println("3. Luas Lingkaran");
                    System.out.println("4. Luas Trapesium");
                    System.out.println("5. Luas Layang-layang");
                    System.out.print("Pilih (1-5) : ");
                    int menu = s.nextInt();
                    double a, b, c;
 
                    switch (menu) {
                        case 1 -> {
                            System.out.print("Sisi : ");
                            a = s.nextDouble();
                            System.out.println("Luas persegi = " + p.luasPersegi(a));
                    }
                        case 2 -> {
                            System.out.print("Alas   : ");
                            a = s.nextDouble();
                            System.out.print("Tinggi : ");
                            b = s.nextDouble();
                            System.out.println("Luas segitiga = " + p.luasSegitiga(a, b));
                    }
                        case 3 -> {
                            System.out.print("Jari-jari : ");
                            a = s.nextDouble();
                            System.out.println("Luas lingkaran = " + p.luasLingkaran(a));
                    }
                        case 4 -> {
                            System.out.print("Sisi sejajar a : ");
                            a = s.nextDouble();
                            System.out.print("Sisi sejajar b : ");
                            b = s.nextDouble();
                            System.out.print("Tinggi         : ");
                            c = s.nextDouble();
                            System.out.println("Luas trapesium = " + p.luasTrapesium(a, b, c));
                    }
                        case 5 -> {
                            System.out.print("Diagonal 1 : ");
                            a = s.nextDouble();
                            System.out.print("Diagonal 2 : ");
                            b = s.nextDouble();
                            System.out.println("Luas layang-layang = " + p.luasLayangLayang(a, b));
                    }
                        default -> System.out.println("Pilihan tidak valid!");
                    }
                    break;

 
                case 0:
                    System.out.println("Terima kasih!");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
 
