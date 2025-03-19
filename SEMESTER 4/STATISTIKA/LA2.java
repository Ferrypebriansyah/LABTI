import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LA2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Hitung Probabilitas");
            System.out.println("2. Hitung Permutasi");
            System.out.println("3. Hitung Kombinasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 1:
                    hitungProbabilitas(input);
                    break;
                case 2:
                    hitungPermutasi(input);
                    break;
                case 3:
                    hitungKombinasi(input);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private static void hitungProbabilitas(BufferedReader input) throws IOException {
        System.out.print("Masukkan jumlah kejadian yang diinginkan: ");
        int kejadianDiinginkan = Integer.parseInt(input.readLine());
        System.out.print("Masukkan jumlah keseluruhan kejadian: ");
        int totalKejadian = Integer.parseInt(input.readLine());

        if (totalKejadian == 0) {
            System.out.println("Jumlah keseluruhan kejadian tidak boleh nol.");
            return;
        }

        double probabilitas = (double) kejadianDiinginkan / totalKejadian;
        System.out.println("Probabilitas: " + probabilitas);
    }

    private static void hitungPermutasi(BufferedReader input) throws IOException {
        System.out.println("Bentuk Umum Permutasi mPn");
        System.out.print("Masukkan bilangan m = ");
        int m = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan n = ");
        int n = Integer.parseInt(input.readLine());

        int o = 1;
        int s = 1;
        int p, q, r;

        for (p = m; p >= 1; p--) {
            o *= p;
        }

        q = m - n;
        for (r = q; r >= 1; r--) {
            s *= r;
        }

        System.out.println(m + "P" + n + " = " + (o / s));
    }

    private static void hitungKombinasi(BufferedReader input) throws IOException {
        System.out.println("Bentuk Umum Kombinasi xCy");
        System.out.print("Masukkan bilangan x = ");
        int x = Integer.parseInt(input.readLine());
        System.out.print("Masukkan bilangan y = ");
        int y = Integer.parseInt(input.readLine());

        int t = 1;
        int u = 1;
        int v = 1;
        int w, z, k, j;

        for (w = x; w >= 1; w--) {
            t *= w;
        }

        k = x - y;
        for (z = k; z >= 1; z--) {
            u *= z;
        }

        for (j = y; j >= 1; j--) {
            v *= j;
        }

        System.out.println(x + "C" + y + " = " + (t / (u * v)));
    }
}
