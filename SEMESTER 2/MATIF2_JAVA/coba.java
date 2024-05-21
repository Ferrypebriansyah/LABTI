import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Input Matriks 3x3");
            System.out.println("2. Hitung Determinan");
            System.out.println("3. Hitung Invers");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan anda: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inputkan elemen-elemen dari matriks 3x3:");
                    System.out.println("Masukkan elemen-elemen matriks 3x3:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Elemen [" + (i + 1) + ", " + (j + 1) + "] = ");

                            matrix[i][j] = input.nextInt();
                        }
                    }
                    System.out.println("Elemen matriks berhasil diinput.");
                    break;

                case 2:
                    int determinan = hitungDeterminan(matrix);
                    System.out.println("Determinan: " + determinan);
                    break;

                case 3:
                    double[][] inversMatrix = hitungInvers(matrix);
                    System.out.println("Invers");
                    printMatrix(inversMatrix);
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }

    public static int hitungDeterminan(int[][] matrix) {
        int determinan = 0;
        determinan += matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        determinan -= matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        determinan += matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinan;
    }

    public static double[][] hitungInvers(int[][] matrix) {
        int determinan = hitungDeterminan(matrix);

        if (determinan == 0) {
            System.out.println("Matrix tidak memiliki invers.");
            return null;
        }

        double[][] inversMatrix = new double[3][3];

        inversMatrix[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinan;
        inversMatrix[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinan;
        inversMatrix[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinan;
        inversMatrix[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinan;
        inversMatrix[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinan;
        inversMatrix[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinan;
        inversMatrix[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinan;
        inversMatrix[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinan;
        inversMatrix[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinan;

        return inversMatrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}