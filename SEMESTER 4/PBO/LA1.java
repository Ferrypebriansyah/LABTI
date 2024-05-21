import java.util.Scanner;

class Balok{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public double hitungVolume(){
        return panjang * lebar * tinggi;
    }
}

class Kubus{
    private double sisi;

    public Kubus(double s){
        sisi = s;
    }

    public double hitungVolume(){
        return Math.pow(sisi, 3);
    }
}

class Kerucut{
    private double alas;
    private double tinggi;

    public Kerucut(double a, double t){
        alas = a;
        tinggi = t;
    }

    public double hitungVolume(){
        return (1.0/3.0) * Math.PI * Math.pow(alas/2, 2) * tinggi;
    }
}

class Bola {
    private double radius;

    public Bola(double r){
        radius = r;
    }

    public double hitungVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class LA1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Volume Bangun Ruang");
        System.out.println("==============================");

        System.out.print("Pilih [1:Balok, 2:Kubus, 3:Kerucut, 4:Bola] : ");
        int pilihan = input.nextInt();

        if(pilihan == 1){
            System.out.print("Masukkan Panjang: ");
            double p = input.nextDouble();
            System.out.print("Masukkan Lebar : ");
            double l = input.nextDouble();
            System.out.print("Masukkan Tinggi: ");
            double t = input.nextDouble();

            Balok balok = new Balok(p, l, t);
            System.out.println("Volume Balok adalah: " + balok.hitungVolume());
        } else if (pilihan == 2){
            System.out.print("Masukkan Sisi: ");
            double s = input.nextDouble();

            Kubus kubus = new Kubus(s);
            System.out.println("Volume Kubus adalah: " + kubus.hitungVolume());
        }else if (pilihan == 3){
            System.out.print("Masukkan Alas: ");
            double a = input.nextDouble();
            System.out.print("Masukkan Tinggi: ");
            double t = input.nextDouble();

            Kerucut kerucut = new Kerucut(a, t);
            System.out.println("Volume Kerucut adalah: " + kerucut.hitungVolume());
        }else if (pilihan == 4){
            System.out.print("Masukkan Radius: ");
            double r = input.nextDouble();

            Bola bola = new Bola(r);
            System.out.println("Volume Bola adalah: " + bola.hitungVolume());
        }else{
            System.out.println("Pilihan tidak valid");
        }
    }
    
}