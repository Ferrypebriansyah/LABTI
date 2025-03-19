import java.util.Scanner;

class Statistik {
    private int[] beratBadan;
    private int[] jumlahSiswa;
    private int totalSiswa;
    private int[] urut;
    private int[][] modusData;
    private int jumlahData;
    private float mean;
    private int median;
    private int modus;

    public Statistik(int kapasitas) {
        beratBadan = new int[kapasitas];
        jumlahSiswa = new int[kapasitas];
        urut = new int[kapasitas];
        modusData = new int[kapasitas][10];
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyaknya jenis berat badan: ");
        jumlahData = scanner.nextInt();

        totalSiswa = 0;
        float totalBerat = 0;
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan berat badan ke " + i + ": ");
            beratBadan[i] = scanner.nextInt();
            System.out.print("Masukkan jumlah siswa dengan berat badan " + beratBadan[i] + ": ");
            jumlahSiswa[i] = scanner.nextInt();
            totalSiswa += jumlahSiswa[i];
            totalBerat += beratBadan[i] * jumlahSiswa[i];
            for (int j = 0; j < jumlahSiswa[i]; j++) {
                urut[totalSiswa - j] = beratBadan[i];
            }
        }
        mean = totalBerat / totalSiswa;
    }

    public void urutkanData() {
        for (int a = 1; a <= totalSiswa; a++) {
            int b = a;
            while ((b > 1) && (urut[b] < urut[b - 1])) {
                int urutan = urut[b];
                urut[b] = urut[b - 1];
                urut[b - 1] = urutan;
                b--;
            }
        }
    }

    public void hitungMedian() {
        if (totalSiswa % 2 == 0) {
            median = (urut[totalSiswa / 2] + urut[(totalSiswa / 2) + 1]) / 2;
        } else {
            median = urut[(totalSiswa + 1) / 2];
        }
    }

    public void hitungModus() {
        int nilaiMuncul = 1;
        for (int i = 1; i <= totalSiswa; i++) {
            int modus = 0;
            for (int j = 1; j <= totalSiswa; j++) {
                if (urut[i] == modusData[j][1]) modus = j;
            }
            if (modus != 0) {
                modusData[modus][2]++;
            } else {
                modusData[nilaiMuncul][1] = urut[i];
                modusData[nilaiMuncul][2] = 1;
                nilaiMuncul++;
            }
        }

        modus = 0;
        int banyak = 0;
        for (int i = 1; i <= totalSiswa; i++) {
            if (modusData[i][2] > banyak) {
                modus = modusData[i][1];
                banyak = modusData[i][2];
            }
        }
    }

    public void cetakHasil() {
        System.out.println("\nData terurut:");
        for (int i = 1; i <= totalSiswa; i++) {
            System.out.print(" " + urut[i]);
        }
        System.out.println("\n");
        System.out.println("Total siswa = " + totalSiswa);
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Modus = " + modus);
    }
}

public class ujian {
    public static void main(String[] args) {
        Statistik stat = new Statistik(1000);
        stat.inputData();
        stat.urutkanData();
        stat.hitungMedian();
        stat.hitungModus();
        stat.cetakHasil();
    }
}
