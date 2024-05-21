import java.io.*;
import java.util.Scanner;

public class LA_7 {
    File fileku = new File("ferrypebriansyah.txt"); 
    Scanner input = new Scanner(System.in);

    public void menu(){
        System.out.println("========= MENU FILEKU =========");
        System.out.println("1. BUAT FILE BARU ");
        System.out.println("2. TULIS FILE ");
        System.out.println("3. BACA FILE  ");
        System.out.println("4. HAPUS FILE");
        System.out.println("5. KELUAR");
        System.out.print("Input angka: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                buatFile();            
                menu();
                break;
            case 2:
                tulisFile();
                menu();
                break;
            case 3:
                bacaFile();
                menu();
                break;
            case 4:
                hapusFile();
                menu();
                break;
            case 5:
                System.exit(pilih);
            default:
                System.out.println("pilihan tidak ada");
                menu();
                break;
        }
    }

    public void buatFile(){
        try {
            if(fileku.createNewFile()){
                System.out.println("File Telah Dibuat: " + fileku.getName());
            } else {
                System.out.println("File sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi Error.");
            e.printStackTrace();
        }
    }

    public void tulisFile(){
        try {
            FileWriter fileku = new FileWriter("ferrypebriansyah.txt");
            fileku.write("Ferry Pebriansyah\n");
            fileku.write("50422572\n");
            fileku.write("1IA25\n");
            fileku.close();
            System.out.println("Berhasil");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }     
    }

    public void bacaFile(){
        try {
            Scanner input = new Scanner(fileku);
            while (input.hasNextLine()) {
            String data = input.nextLine();
            System.out.println(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void hapusFile(){
        if (fileku.delete()) { 
            System.out.println("File yang telah terhapus: " + fileku.getName());
        } else {
        System.out.println("Gagal untuk menghapus file.");
        } 
    }

    public static void main(String[] args) {
        LA_7 fp = new LA_7();
        fp.menu();
    }
}

