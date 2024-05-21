import java.io.*;

public class LA_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String panjangStr;
        String namaMhs[], kelasMhs[], npmMhs[];
        int utsMhs[], uasMhs[];
        int panjang;

        System.out.print("Masukkan jumlah mahasiswa: ");
        panjangStr = br.readLine();
        panjang = Integer.parseInt(panjangStr);

        namaMhs = new String[panjang];
        kelasMhs = new String[panjang];
        npmMhs = new String[panjang];
        utsMhs = new int[panjang];
        uasMhs = new int[panjang];

        for (int i = 0; i < panjang; i++) {
                System.out.println("\nData mahasiswa ke-"+(i+1));
                System.out.print("Masukkan Nama\t: ");
                namaMhs[i] = br.readLine();
                System.out.print("Masukkan Kelas\t: ");
                kelasMhs[i] = br.readLine();
                System.out.print("Masukkan NPM\t: ");
                npmMhs[i] = br.readLine();
                System.out.print("Masukkan Nilai UTS: ");
                utsMhs[i] = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nilai UAS: ");
                uasMhs[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("\n============== Hasil ==================");
        for (int i = 0; i < panjang; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.println("Nama\t: "+namaMhs[i]);
            System.out.println("kelas\t: "+kelasMhs[i]);
            System.out.println("npm\t: "+npmMhs[i]);
            System.out.println("Nilai UTS: "+utsMhs[i]);
            System.out.println("Nilai UAS: "+uasMhs[i]);
            System.out.println("Nilai Rata-Rata: "+((utsMhs[i]+uasMhs[i])/2));
            System.out.println("======================================");
            
        }
        
    }
    
}

