import java.util.Scanner;

class PRL {
    public double[] x;
    public double[] y;

    public PRL(double[] x, double[] y) {
        this.x = x;
        this.y = y;
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }
}

class Hasilx extends PRL {
    public Hasilx(double[] x, double[] y) {
        super(x, y);
    }

    public double tambahx() {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum;
    }
}

class Hasily extends PRL {
    public Hasily(double[] x, double[] y) {
        super(x, y);
    }

    public double tambahy() {
        double sum = 0;
        for (double num : y) {
            sum += num;
        }
        return sum;
    }
}

class Kuadrat extends PRL {
    public Kuadrat(double[] x, double[] y) {
        super(x, y);
    }

    public double[] hitungKuadratX() {
        double[] kuadratx = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            kuadratx[i] = x[i] * x[i];
        }
        return kuadratx;
    }

    public double[] hitungKuadratY() {
        double[] kuadraty = new double[y.length];
        for (int i = 0; i < y.length; i++) {
            kuadraty[i] = y[i] * y[i];
        }
        return kuadraty;
    }
}

public class LA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Masukkan nilai x:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]: ", i);
            x[i] = scanner.nextDouble();
        }

        System.out.println("Masukkan nilai y:");
        for (int i = 0; i < n; i++) {
            System.out.printf("y[%d]: ", i);
            y[i] = scanner.nextDouble();
        }

        Hasilx hasilX = new Hasilx(x, y);
        Hasily hasilY = new Hasily(x, y);

        Kuadrat kuadrat = new Kuadrat(x, y);
        double[] kuadratX = kuadrat.hitungKuadratX();
        double[] kuadratY = kuadrat.hitungKuadratY();

        double totalX = hasilX.tambahx();
        double totalY = hasilY.tambahy();

        double totalKuadratX = 0;
        double totalKuadratY = 0;
        double totalXY = 0;

        for (int i = 0; i < x.length; i++) {
            totalKuadratX += kuadratX[i];
            totalKuadratY += kuadratY[i];
            totalXY += x[i] * y[i];
        }

        System.out.println("\nX\tY\tX^2\tY^2\tXY");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", x[i], y[i], kuadratX[i], kuadratY[i], x[i] * y[i]);
        }

        System.out.println("---------------------------------------------------");

        System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", totalX, totalY, totalKuadratX, totalKuadratY, totalXY);
        System.out.println("");

        // persamaan regresi linier
        double A = (totalY * totalKuadratX) - (totalX * totalXY);
        double a = (n * totalKuadratX) - (totalX * totalX);
        double B = (n * totalXY) - (totalX * totalY);
        double b = (n * totalKuadratX) - (totalX * totalX);

        System.out.print("Masukkan nilai variabel bebas (p): ");
        double p = scanner.nextDouble();

        System.out.println("Persamaan regresi linier: Y = a + bx");
        System.out.printf("Y = %.2f / %.2f + %.2f / %.2f * %.2f\n", A, a, B, b, p);

        double hasil = A / a + (B / b) * p;
        System.out.printf("Y = %.2f\n", hasil);
        System.out.println("");

        scanner.close();
    }
}
