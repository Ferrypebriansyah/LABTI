import java.io.*;

public class ahmadzaky_50422138 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriks = new int[3][3];
        System.out.println("================== Ordo Matriks 3x3 ==================");
        System.out.println("Masukkan Elemen Matriks : ");

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                System.out.print("Elemen [" +  (i + 1) + "," + (j+1) + "] = ");
                matriks[i][j] = Integer.parseInt(input.readLine());
            }
        }

        for (int i = 0; i < matriks.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriks.length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println("\n================== MENU ==================");
        System.out.println("1. Determinan 3x3");
        System.out.println("2. Invers 3x3");
        System.out.println("3. Exit");
        System.out.print("Masukkan Pilihan : ");
        int opt = Integer.parseInt(input.readLine());
        System.out.println();

        switch (opt) {
            case 1:
                int det = ((matriks[0][0]*matriks[1][1]*matriks[2][2])
                +(matriks[0][1]*matriks[1][2]*matriks[2][0])
                +(matriks[0][2]*matriks[1][0]*matriks[2][1]))
                -((matriks[0][2]*matriks[1][1]*matriks[2][0])
                +(matriks[0][0]*matriks[1][2]*matriks[2][1])
                +(matriks[0][1]*matriks[1][0]*matriks[2][2])
                );

                System.out.println("Determinan Matriks = " + det);
                break;
        
            case 2:

                int detInvers = ((matriks[0][0]*matriks[1][1]*matriks[2][2])
                +(matriks[0][1]*matriks[1][2]*matriks[2][0])
                +(matriks[0][2]*matriks[1][0]*matriks[2][1]))
                -((matriks[0][2]*matriks[1][1]*matriks[2][0])
                +(matriks[0][0]*matriks[1][2]*matriks[2][1])
                +(matriks[0][1]*matriks[1][0]*matriks[2][2])
                );

                if (detInvers!=0) {
                    int m11, m12, m13, m21, m22, m23, m31, m32, m33;
            
                    m11 = 1*((matriks[1][1]*matriks[2][2])-(matriks[1][2]*matriks[2][1]));
                    m12 = -1*((matriks[1][0]*matriks[2][2])-(matriks[1][2]*matriks[2][0]));
                    m13 = 1*((matriks[1][0]*matriks[2][1])-(matriks[1][1]*matriks[2][0]));
                    m21 = -1*((matriks[0][1]*matriks[2][2])-(matriks[0][2]*matriks[2][1]));
                    m22 = 1*((matriks[0][0]*matriks[2][2])-(matriks[0][2]*matriks[2][0]));
                    m23 = -1*((matriks[0][0]*matriks[2][1])-(matriks[0][1]*matriks[2][0]));
                    m31 = 1*((matriks[0][1]*matriks[1][2])-(matriks[0][2]*matriks[1][1]));
                    m32 = -1*((matriks[0][0]*matriks[1][2])-(matriks[0][2]*matriks[1][0]));
                    m33 = 1*((matriks[0][0]*matriks[1][1])-(matriks[0][1]*matriks[1][0]));

                    matriks[0][0] = m11;
                    matriks[0][1] = m21;
                    matriks[0][2] = m31;
                    matriks[1][0] = m12;
                    matriks[1][1] = m22;
                    matriks[1][2] = m32;
                    matriks[2][0] = m13;
                    matriks[2][1] = m23;
                    matriks[2][2] = m33;

                    System.out.println("Matriks Inversnya : ");
                    for (int i = 0; i < matriks.length; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < matriks.length; j++) {
                            System.out.print(matriks[i][j] + "/" + detInvers + " ");
                        }
                        System.out.println("|");
                    }
                } else {
                    System.out.println("Matriks Tidak Memiliki Invers, Karena  Matriks Singular");
                }
                break;

            case 3:
                System.out.println("================== Goodbye~ ==================");
                break;
            default:
                break;
        }

    }
}
