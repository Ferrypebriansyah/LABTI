import java.util.Scanner;

public class LA_6 {
    private String nama, kelas, npm;

    Scanner input = new Scanner(System.in);

    LA_6(String nama, String kelas, String npm){
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
    }

    void mahasiswa(){
        System.out.println("===============================");
        System.out.println("Nama Saya " + this.nama);
        System.out.println("Kelas Saya " + this.kelas);
        System.out.println("NPM Saya " + this.npm);
        System.out.println("===============================");
    }

    void menu(){
        System.out.println("==========MENU [Ferry Pebriansyah]==========");
        System.out.println("1. Segitiga Bintang");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Keluar");
        System.out.print("\nMasukkan Pilihan: ");
        int pil = input.nextInt();

        switch (pil) {
            case 1:
                segitiga();
                keluar();
                break;

            case 2:
                System.out.println("==========Program Luas Segitiga=========");
                int a, b;
                System.out.print("Masukkan Alas\t: ");
                a = input.nextInt();
                System.out.print("Masukkan Tinggi\t: ");
                b = input.nextInt();
                System.out.println("Luas Segitiga : " + lsegitiga(a,b));
                keluar();
                break;

            case 3:
                keluar();
                break;

            default:
                System.out.println("Input tidak sesuai dengan pilihan pada Menu");
                System.out.println("Kembali ke Menu");
                System.out.println("===========================================");
                menu();
        }
    }

    void segitiga(){
        int n;
        System.out.println("==========Program Segitiga Bintang==========");
        System.out.print("Masukkan Tinggi: ");
        n = input.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    int lsegitiga(int a, int b){
        int luas;
        luas = (a*b)/2;
        return luas;
    }

    void keluar(){
        input.nextLine();
        System.out.print("Kembali ke Menu? [Y/N]: ");
        String ext = input.nextLine();
        if(ext.equalsIgnoreCase("Y")){
            System.out.println("~~Kembali ke Menu~~");
            System.out.println();
            menu();
        } else {
            System.out.println("Good Byee~~~");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        LA_6 LAFerry = new LA_6("Ferry Pebriansyah", "1IA25", "50422572");
        LAFerry.mahasiswa();
        LAFerry.menu();
    }
}
