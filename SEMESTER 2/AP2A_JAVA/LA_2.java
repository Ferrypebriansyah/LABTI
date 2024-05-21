import java.util.Scanner;

public class LA_2 {
    public static void main(String args[]){
        Scanner namamu = new Scanner(System.in);

        System.out.println ("==========================");
        System.out.println ("========= MENU LA =========");
        System.out.println ("==========================");
        System.out.println ("1. Program Komparasi Nilai");
        System.out.println ("2. Program Ganjil Genap");
        System.out.println ("3. Program Weird");
        System.out.println ("4. Exit");
        System.out.println ("==========================");
        System.out.print ("Masukkan angka [1-4]: ");
        int pilih = namamu.nextInt();

        switch (pilih){
            case 1:
                System.out.print ("Masukkan Nilai UTS: ");
                int uts = namamu.nextInt();
                System.out.print ("Masukkan Nilai UAS: ");
                int uas = namamu.nextInt();

                if (uts == uas){
                    System.out.print ("UTS sama dengan UAS");
                } else if (uts > uas){
                    System.out.print ("UTS lebih dari UAS");
                } else {
                    System.out.print ("UTS kurang dari UAS");
                }
                break;

            case 2:
                System.out.println ("===========================");
                System.out.println ("2. Program Ganjil Genap");
                System.out.println ("===========================");
                System.out.println ("Pengecekan Program Ganjil Genap");
                System.out.print ("Masukkan Angka: ");
                int angka = namamu.nextInt();

                if (angka % 2 ==0){
                    System.out.println (angka + " Merupakkan angka genap");
                } else {
                    System.out.println (angka + " Merupakkan angka ganjil");
                }
                break;

            case 3:
            System.out.println ("===========================");
            System.out.println ("3. Program Weird");
            System.out.println ("===========================");
            System.out.print ("Input Angka: ");
            int a = namamu.nextInt();
            
            if (a % 2 == 0){
                    if ((a <= 20 && a >= 6)){
                        System.out.println ("Weird");
                    } else {
                        System.out.println ("Not Weird");
                    }

            } else {
                System.out.println ("Weird");
            }
            namamu.close();
            break;
        }
    }
}


