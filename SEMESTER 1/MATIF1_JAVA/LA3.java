import java.util.Scanner;

public class LA3{
    int[] HimpunanA;
    int[] HimpunanB;
    int[] HimpunanRelasi;
    int[] HimpunanAsal;
    int jumlahHimpunanA, jumlahHimpunanB, jumlahRelasi;

    Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        LA3 obj = new LA3();
        obj.inputAnggota();
        obj.cetakHimpunan();
        obj.inputRelasi();
        obj.cekFungsi();
        obj.cetakRelasi();
    }

    public void inputAnggota(){
        System.out.print("Masukkan Jumlah Himpunan A = ");
        jumlahHimpunanA = input.nextInt();
        HimpunanA = new int[jumlahHimpunanA];
        for(int i = 0; i <= (jumlahHimpunanA-1); i++){
            System.out.print("Himpunan A yang ke "+ (i+1)+" : ");
            HimpunanA[i]=input.nextInt();
        }
    
        System.out.print("Masukkan Jumlah Himpunan B = ");
        jumlahHimpunanB = input.nextInt();
        HimpunanB = new int[jumlahHimpunanB];
        for(int i = 0; i <= (jumlahHimpunanB-1); i++){
            System.out.print("Himpunan B yang ke "+ (i+1)+" : ");
            HimpunanB[i]=input.nextInt();
        }
    }
    public void cetakHimpunan(){
        System.out.print("Anggota Himpunan A = { ");
        for (int i = 0; i <= (jumlahHimpunanA-1); i++){
            System.out.print(HimpunanA[i]+ " ");
        }
        System.out.println("}");

        System.out.print("Anggota Himpunan B = { ");
        for (int i = 0;i<=(jumlahHimpunanB-1);i++){
            System.out.print(HimpunanB[i]+ " ");
        }
        System.out.println("}");
    }

    public void inputRelasi(){
        int jumlahRelasiMaks = jumlahHimpunanA * jumlahHimpunanB;
        System.out.println("Relasi Maksimal Adalah "+jumlahRelasiMaks);
        System.out.print(" ");

        do{
            System.out.print("Masukkan Jumlah relasi yang Terjadi : ");
            jumlahRelasi = input.nextInt();
        }while(jumlahRelasi > jumlahRelasiMaks);

        HimpunanRelasi = new int[jumlahRelasi];
        HimpunanAsal = new int[jumlahRelasi];
        System.out.println("Masukkan Relasi yang Terjadi : ");
        for(int i=0; i <= (jumlahRelasi-1); i++){
            int[] temp = new int [jumlahRelasi];
            int[] temp2 = new int[jumlahRelasi];
            boolean SamaA = false;
            boolean SamaB = false;

            System.out.println("Relasi ke "+(i + 1)+" : ");
            do{
                System.out.print("Masukkan Asal A : ");
                temp[i] = input.nextInt();
                System.out.print("Masukkan Tujuan B : ");
                temp2[i] = input.nextInt();

                for (int j = 0; j <= (jumlahHimpunanA-1); j++){
                    if(temp[i] == HimpunanA[j]){
                        SamaA = true;
                    }
                }

                for (int k = 0; k <= (jumlahHimpunanB-1); k++){
                    if(temp2[i] == HimpunanB[k]){
                        SamaB = true;
                    }
                }
                if(SamaA == false || SamaB == false){
                    System.out.println("Anggota Himpunan Tidak Terdapat di Himpunan A atau B");
                }else if(SamaA == true && SamaB == true){
                    HimpunanRelasi[i] = temp2[i];
                    HimpunanAsal[i] = temp[i];
                }

            }while(SamaA == false || SamaB == false);
        }
    }

    public void cekFungsi(){

        int jumlahAnggota = 0;
        boolean adaSama = false;

        for(int i=0; i <= (jumlahHimpunanA-1); i++){
            for(int j=0; j <= (jumlahHimpunanB-1); j++){
                if(HimpunanA[i] == HimpunanAsal[j]){
                    jumlahAnggota++;
                }
            }
        }

        for(int i = 0;i<=(jumlahRelasi-1);i++){
            for(int j=i+1;j<=(jumlahRelasi-1);j++){
                if(HimpunanAsal[i]==HimpunanAsal[j]){
                    adaSama = true;
                }
            }
        }

        if(jumlahAnggota==jumlahHimpunanA && adaSama == false){
            System.out.println("Relasi yang diinput adalah Fungsi");
        }else{
            System.out.println("Relasi yang diinput Bukan Fungsi hanya relasi biasa "+ jumlahAnggota + adaSama);
        }
    }

    public void cetakRelasi(){
        System.out.print("Daerah Domain = { ");
        for(int i=0;i<=(jumlahHimpunanA-1);i++){
            System.out.print(HimpunanA[i]+" ");
        }
        System.out.println("}");

        System.out.print("Daerah Kodomain adalah : { ");
        for(int i=0;i<=(jumlahHimpunanB-1);i++){
            System.out.print(HimpunanB[i]+ " ");
        }
        System.out.println("}");
        System.out.print("Daerah Range adalah : { ");
        for(int i= 0;i<= (jumlahRelasi-1);i++){
            for (int j = i+1;j<=(jumlahRelasi-1);j++){
                if(HimpunanRelasi[i]==HimpunanRelasi[j]) {
                }
            }
            if(true)System.out.print(HimpunanRelasi[i]+" ");
        }
        System.out.println("}");
    }
}



