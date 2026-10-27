package tugaspraktikum4;

public class Perhitungan {

    // Atribut Soal 1 
    int bilangan;

    // Atribut Soal 2 
    int kodeHari;

    // Atribut Soal 3 
    String nama, statusNikah;
    int nik, kodeGolongan, jumlahAnak;
    double gajiPokok, tunjanganPasangan, tunjanganAnak, gajiBersih;

    //  Atribut Soal 4 
    int tahun;

    //  Atribut Soal 5 
    double penjualan, uangJasa, komisi, pendapatan;

    //  Atribut Soal 6 
    boolean member;
    double totalBelanja, uangBayar, diskon, totalBayar, kembalian;

    // Soal 1: genap / ganjil 
    boolean isGenap() {
        return bilangan % 2 == 0;
    }

    // Soal 2: kode hari -> nama hari
    String getNamaHari() {
        String hari;
        hari = switch (kodeHari) {
            case 1 -> "Senin";
            case 2 -> "Selasa";
            case 3 -> "Rabu";
            case 4 -> "Kamis";
            case 5 -> "Jumat";
            case 6 -> "Sabtu";
            case 7 -> "Minggu";
            default -> "";
        };
        return hari;
    }

    // Soal 3: gaji bersih (return false jika kode golongan salah) 
    boolean hitungGaji() {
        switch (kodeGolongan) {
            case 1 -> {
                gajiPokok = 1200000; statusNikah = "Menikah";
            }
            case 2 -> {
                gajiPokok = 1500000; statusNikah = "Belum menikah";
            }
            case 3 -> {
                gajiPokok = 1750000; statusNikah = "Cerai";
            }
            case 4 -> {
                gajiPokok = 2000000; statusNikah = "Menikah dan punya anak";
            }
            default -> {
                return false;
            }
        }

        // tunjangan pasangan 10% gaji pokok (golongan 1 dan 4 = menikah)
        if (kodeGolongan == 1 || kodeGolongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        } else {
            tunjanganPasangan = 0;
        }

        // tunjangan anak 5% gaji pokok x jumlah anak (golongan 4)
        if (kodeGolongan == 4) {
            tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        } else {
            tunjanganAnak = 0;
            jumlahAnak = 0;
        }

        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;
        return true;
    }

    //  Soal 4: tahun kabisat 
    boolean isKabisat() {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    //  Soal 5: pendapatan salesman 
    void hitungPendapatan() {
        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }
        pendapatan = uangJasa + komisi;
    }

    //  Soal 6: kasir sederhana (if-else) 
    void hitungKasir() {
        diskon = 0;
        if (member) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        totalBayar = totalBelanja - diskon;
        kembalian = uangBayar - totalBayar;
    }

    //  Soal 7: luas bangun datar 
    double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    double luasTrapesium(double a, double b, double tinggi) {
        return 0.5 * (a + b) * tinggi;
    }

    double luasLayangLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }
}