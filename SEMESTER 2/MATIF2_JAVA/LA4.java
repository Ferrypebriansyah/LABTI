import java.io.*;
import java.text.DecimalFormat;

class LA4 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ordo Matrik = 3x3");
        double[][] matriksY = new double[3][3];
        System.out.println("Masukkan Elemen Matriksnya : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + (i + 1) + ", " + (j + 1) + "] = ");
                matriksY[i][j] = Double.parseDouble(input.readLine());
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(formatDecimal(matriksY[i][j]) + " ");
            }
            System.out.println("|");
        }
        double determinan = ((matriksY[0][0] * matriksY[1][1] * matriksY[2][2])
                + (matriksY[0][1] * matriksY[1][2] * matriksY[2][0])
                + (matriksY[0][2] * matriksY[1][0] * matriksY[2][1])
                - (matriksY[0][2] * matriksY[1][1] * matriksY[2][0])
                + (matriksY[0][0] * matriksY[1][2] * matriksY[2][1])
                + (matriksY[0][1] * matriksY[1][0] * matriksY[2][2]));
        System.out.println("Determinan Matriks = " + formatDecimal(determinan));


        double invDeterminan = 1.0 / determinan;
        double m11, m12, m13, m21, m22, m23, m31, m32, m33;
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
                System.out.print(formatDecimal(matriksY[i][j] * invDeterminan) + " ");
            }
            System.out.println("|");
        }
    }

    private static String formatDecimal(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }
}



