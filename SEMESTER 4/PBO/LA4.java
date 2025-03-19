import java.util.Scanner;

abstract class Bentuk {

    
    abstract void luas();

    
    abstract void tampil();
}

class Lingkaran extends Bentuk {
    private int jariJari;

    // Setter
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    // Getter
    public int getJariJari() {
        return jariJari;
    }

    @Override
    public void luas() {
        double luasLingkaran = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luasLingkaran);
    }

    @Override
    public void tampil() {
        System.out.println("Menampilkan Lingkaran");
    }
}

class PersegiPanjang extends Bentuk {
    private int panjang;
    private int lebar;

    // Setter
    public void setDimensi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    @Override
    public void luas() {
        int luasPersegiPanjang = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
    }

    @Override
    public void tampil() {
        System.out.println("Menampilkan Persegi Panjang");
    }
}

class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;

    // Setter
    public void setDimensi(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Getter
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void luas() {
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luasSegitiga);
    }

    @Override
    public void tampil() {
        System.out.println("Menampilkan Segitiga");
    }
}

class Persegi extends Bentuk {
    private int sisi;

    // Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    @Override
    public void luas() {
        int luasPersegi = sisi * sisi;
        System.out.println("Luas persegi: " + luasPersegi);
    }

    @Override
    public void tampil() {
        System.out.println("Menampilkan Persegi");
    }
}

public class LA4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            // Meminta input dari pengguna untuk menentukan jenis bentuk
            System.out.println("Menghitung Luas Bangun Datar");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Persegi");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    int jariJari = scanner.nextInt();
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.setJariJari(jariJari);
                    lingkaran.luas();
                    lingkaran.tampil();
                    break;
                case "2":
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    persegiPanjang.setDimensi(panjang, lebar);
                    persegiPanjang.luas();
                    persegiPanjang.tampil();
                    break;
                case "3":
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    Segitiga segitiga = new Segitiga();
                    segitiga.setDimensi(alas, tinggi);
                    segitiga.luas();
                    segitiga.tampil();
                    break;
                case "4":
                    System.out.print("Masukkan panjang sisi persegi: ");
                    int sisi = scanner.nextInt();
                    Persegi persegi = new Persegi();
                    persegi.setSisi(sisi);
                    persegi.luas();
                    persegi.tampil();
                    break;
                case "5":
                    loop = false;
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
