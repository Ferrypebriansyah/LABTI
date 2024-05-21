
import java.util.Scanner;

public class FerryPebriansyah_50422572{
    Scanner input = new Scanner(System.in);
    int[][] matriksY = new int[3][3];
    public void menu(){
        System.out.println("========= MENU FILEKU =========");
        System.out.println("1. INPUT MATRIKS ");
        System.out.println("2. DETERMINAN MATRIKS ");
        System.out.println("3. INVERS MATRIKS");
        System.out.println("4. KELUAR");
        System.out.print("Input angka: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                inputMatriks();            
                menu();
                break;
            case 2:
                determinanMatriks();
                menu();
                break;
            case 3:
                inversMatriks();
                menu();
                break;
            default:
                System.out.println("bye");
                break;
        }
    }

    public void inputMatriks(){
        System.out.println("Inputkan elemen-elemen dari matriks 3x3:");
        System.out.println("Masukkan elemen-elemen matriks 3x3:");
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + (i + 1) + ", " + (j + 1) + "] = ");
                matriksY[i][j] = input.nextInt();
                    }
                }
            System.out.println("----------------Hasil Matriks--------------");
                for(int i=0;i<3;i++){
                    System.out.print("| ");
                    for(int j=0;j<3;j++)
                    {
                        System.out.print(matriksY[i][j]+" ");
                    }
                    System.out.println("|");
                }
            System.out.println("Elemen matriks berhasil diinput.");

    }
        

    public void determinanMatriks(){
        int dtrmn = (matriksY[0][0] * ((matriksY[1][1] * matriksY[2][2]) - (matriksY[2][1] * matriksY[1][2]))) -
            (matriksY[0][1] * ((matriksY[1][0] * matriksY[2][2]) - (matriksY[2][0] * matriksY[1][2]))) +
            (matriksY[0][2] * ((matriksY[1][0] * matriksY[2][1]) - (matriksY[2][0] * matriksY[1][1])));
            System.out.println("Determinan Matriks= "+dtrmn);
    }

    public void inversMatriks(){
        int determinan = ((matriksY[0][0] * matriksY[1][1] * matriksY[2][2])
                + (matriksY[0][1] * matriksY[1][2] * matriksY[2][0])
                + (matriksY[0][2] * matriksY[1][0] * matriksY[2][1])
                - (matriksY[0][2] * matriksY[1][1] * matriksY[2][0])
                + (matriksY[0][0] * matriksY[1][2] * matriksY[2][1])
                + (matriksY[0][1] * matriksY[1][0] * matriksY[2][2]));
        System.out.println("Determinan Matriks= " + determinan);

        int m11, m12, m13, m21, m22, m23, m31, m32, m33;
        m11 = ((matriksY[1][1] * matriksY[2][2]) - (matriksY[1][2] * matriksY[2][1]));
        m12 = -((matriksY[1][0] * matriksY[2][2]) - (matriksY[1][2] * matriksY[2][0]));
        m13 = ((matriksY[1][0] * matriksY[2][1]) - (matriksY[1][1] * matriksY[2][0]));
        m21 = -((matriksY[0][1] * matriksY[2][2]) - (matriksY[0][2] * matriksY[2][1]));
        m22 = ((matriksY[0][0] * matriksY[2][2]) - (matriksY[0][2] * matriksY[2][0]));
        m23 = -((matriksY[0][0] * matriksY[2][1]) - (matriksY[0][1] * matriksY[2][0]));
        m31 = ((matriksY[0][1] * matriksY[1][2]) - (matriksY[0][2] * matriksY[1][1]));
        m32 = -((matriksY[0][0] * matriksY[1][2]) - (matriksY[0][2] * matriksY[1][0]));
        m33 = ((matriksY[0][0] * matriksY[1][1]) - (matriksY[0][1] * matriksY[1][0]));

        matriksY[0][0] = m11;
        matriksY[0][1] = m21;
        matriksY[0][2] = m31;
        matriksY[1][0] = m12;
        matriksY[1][1] = m22;
        matriksY[1][2] = m32;
        matriksY[2][0] = m13;
        matriksY[2][1] = m23;
        matriksY[2][2] = m33;

        System.out.println("Matriks Inversnya : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriksY[i][j] /determinan + " ");
            }
            System.out.println("|");
        }
    }
        
        

    
    public static void main(String[] args) {
        FerryPebriansyah_50422572 fp = new FerryPebriansyah_50422572();
        fp.menu();
    }
}