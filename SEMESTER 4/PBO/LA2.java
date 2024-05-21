import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String npm;
    private String kelas;

    public Mahasiswa(String nama, String npm, String kelas) {
        if (npm.length() != 8 || !npm.matches("\\d{8}")) {
            throw new IllegalArgumentException("NPM harus 8 digit numerik.");
        }
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("Kelas : " + kelas);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNPM(String npm) {
        if (npm.length() != 8 || !npm.matches("\\d{8}")) {
            throw new IllegalArgumentException("NPM harus 8 digit numerik");
        }
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

class MahasiswaPenilaian extends Mahasiswa {
    private double nilai;

    public MahasiswaPenilaian(String nama, String npm, String kelas, double nilai) {
        super(nama, npm, kelas);
        this.nilai = nilai;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        ;
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + hitungGrade());
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    private String hitungGrade() {
        if (nilai < 0 || nilai > 100) {
            return "Nilai tidak valid";
        } else if (nilai >= 90) {
            return "Grade A";
        } else if (nilai >= 80) {
            return "Grade B";
        } else if (nilai >= 70) {
            return "Grade C";
        } else if (nilai >= 60) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }
}

public class LA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("==========================");
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NPM Mahasiswa (8 digit ): ");
            String npm = scanner.nextLine();

            System.out.print("Masukkan kelas mahasiswa: ");
            String kelas = scanner.nextLine();

            System.out.print("Masukkan nilai mahasiswa: ");
            double nilai = scanner.nextDouble();

            System.out.println("==========================");
            MahasiswaPenilaian mahasiswa = new MahasiswaPenilaian(nama, npm, kelas, nilai);
            mahasiswa.tampilkanData();
            ;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // Good practice to close the scanner
        }
    }
}

