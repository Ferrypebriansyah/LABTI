import java.util.Scanner;

public class LA_1 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.println("==============================");
		System.out.println("Biodata Mahasiswa 1IA25");
		System.out.print("Activity (Minggu ke-[nomor])  : ");
		String act = input.nextLine();
		System.out.print("Nama Lengkap\t: ");
		String nama = input.nextLine();
		System.out.print("Kelas\t\t: ");
		String kelas = input.nextLine();
		System.out.print("NPM\t\t: ");
		String npm = input.nextLine();
		System.out.print("Jurusan\t\t: ");
		String jurusan = input.nextLine();
		System.out.print("Nilai UTS\t: ");
		double uts = input.nextDouble();
		System.out.print("Nilai UAS\t: ");
		double uas = input.nextDouble();
        double hasil = (uas*0.3)+(uts*0.7);
        
		System.out.println("=============================");
		System.out.println("Activity\t: "+act);
		System.out.println("Nama Lengkap\t: "+nama);
		System.out.println("Kelas\t\t: "+kelas);
		System.out.println("NPM\t\t: "+npm);
		System.out.println("Jurusan\t\t: "+jurusan);
		System.out.println("Nilai Total\t: "+hasil);
		input.close();
	}

}

