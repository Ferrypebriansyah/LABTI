def main():
    print("\n=== Data Mahasiswa ===")
    jmlh = int(input("Banyaknya File : "))
    for ulang in range (1, jmlh + 1):
        print()
        print("Input nama file [<nama>.txt/dat]: ")
        namaFile = input(f"File ke-{ulang}: ")
        print()
        with open(namaFile, "a") as data:
            print ("Data Mahasiswa ke-", ulang)
            nama  = input("Masukkan Nama  : ")
            kelas = input("Masukkan Kelas : ")
            npm = input("Masukkan NPM   : ")
            uts = int(input("Masukkan Nilas UTS : "))
            uas = int(input("Masukkan Nilas UAS : "))
            uu  = int(input("Masukkan Nilas UU  : "))
            total = (uts+uas+uu) / 3

            data.write("=== Data Mahasiswa ===\n")
            data.write("Nama Anda  : " + nama + '\n')
            data.write("Kelas Anda : " + kelas + '\n')
            data.write("NPM Anda   : " + npm + '\n')
            data.write("Total Nilai Ujian Anda : " + str(total) + '\n')
            if total >= 80:
                data.write("A\n")
            elif total >= 70:
                data.write("B\n")
            elif total >= 55:
                data.write("C\n")
            elif total >= 40:
                data.write("D\n")
            elif total <= 39:
                data.write("E\n")
            if total <= 50:
                data.write("KETERANGAN : GAGAL\n")
            else:
                data.write("KETERANGAN : LULUS\n")
            data.write('\n')
            print()
    print("Data berhasil dibuat")
    print("\n=== Membaca Isi File ===")
    for ulang in range(1, jmlh + 1):
        try:
            nama_file = input("Masukkan nama file yang telah dibuat : ")
            infile = open(nama_file, "r")
            isi_file = infile.read()
            print (isi_file)
            infile.close
        except FileNotFoundError:
            print ("File tidak ditemukan.\n")
main()
