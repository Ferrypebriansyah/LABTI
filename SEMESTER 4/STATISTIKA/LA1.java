import java.io.*;

// Class untuk menyimpan nilai yang ditentukan
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

    // Inisialisasi  beberapa Array
    public Statistik(int kapasitas) {
        beratBadan = new int[kapasitas];
        jumlahSiswa = new int[kapasitas];
        urut = new int[kapasitas];
        modusData = new int[kapasitas][3];
    }

    // Berisi Method buat input data
    public void inputData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan banyaknya jenis berat badan: ");
        jumlahData = Integer.parseInt(reader.readLine());

        totalSiswa = 0;
        float totalBerat = 0;
        for (int i = 1; i <= jumlahData; i++) {
            System.out.print("Masukkan berat badan ke " + i + ": ");
            beratBadan[i] = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan jumlah siswa dengan berat badan " + beratBadan[i] + ": ");
            jumlahSiswa[i] = Integer.parseInt(reader.readLine());
            totalSiswa += jumlahSiswa[i];
            totalBerat += beratBadan[i] * jumlahSiswa[i];
            for (int j = 0; j < jumlahSiswa[i]; j++) {
                urut[totalSiswa - j] = beratBadan[i];
            }
        }
        mean = totalBerat / totalSiswa;
    }

    // Method buat ngurutin data siswa
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

    // Method untuk menghitung median
    public void hitungMedian() {
        if (totalSiswa % 2 == 0) {
            median = (urut[totalSiswa / 2] + urut[(totalSiswa / 2) + 1]) / 2;
        } else {
            median = urut[(totalSiswa + 1) / 2];
        }
    }

    // Method untuk menghitung modus
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

    // Method untuk mencetak mean median modus
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

// kelas utama untuk jalankan semua method
public class LA1 {
    public static void main(String[] args) throws IOException {
        // Inisialisasi kelas Statistik dengan kapasitas data
        Statistik stat = new Statistik(100);
        stat.inputData();
        stat.urutkanData();
        stat.hitungMedian();
        stat.hitungModus();
        stat.cetakHasil();
    }
}
