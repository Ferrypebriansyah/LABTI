def main():
    print("\n=== PERTEMUAN 4 ===")
    print("====== Menu ======")
    print("1. Method Append")
    print("2. Method Sort")
    print("3. Method Reverse")
    print("4. Method Index")
    print("5. Method Insert")
    print("6. Method Count")
    print("7. Method Remove")
    print("8. Method Pop")
    print("9. exit")

    pil = int(input("Masukan Pilihan: "))

    if pil == 1:
        print()
        penyanyi = ["Chris Martin", "Tim Bergling","Taylor Swift", "Louis Armstrong"]
        print("List sebelum ditambahkan:\n", penyanyi)
        tambahkan = input("\nTambahkan list(nama penyanyi): ")
        penyanyi.append(tambahkan)
        print("\nList sesudah ditambahkan:\n", penyanyi)

        main()

    elif pil == 2:
        print()
        angka = [5, 0, 4, 2, 2, 5, 7, 2]
        print("List sebelum diurutkan:\n", angka)
        angka.sort()
        print("\nList sesudah diurutkan menggunakan method sort():\n", angka)

        main()

    elif pil == 3:
        print()
        angka = [5, 0, 4, 2, 2, 5, 7, 2]
        print("List sebelum dibalik:\n", angka)
        angka.reverse()
        print("\nList sesudah urutan dibalik menggunakan method reverse():", angka)

        main()

    elif pil == 4:
        print()
        data = ["python", "php", "java", "C", "golang"]
        print("Data list:\n", data)
        print("Mengetahui posisi elemen menggunakan fungsi index(): ")
        print("Posisi elemen php adalah:", data.index("php"))
        print("Posisi elemen java adalah:", data.index("java"))
        print("Posisi elemen C adalah:", data.index("C"))
        print("Posisi elemen golang adalah:", data.index("golang"))
        print("Posisi elemen python adalah:", data.index("python"))

        main()

    elif pil == 5:
        print()
        data = ["Nama: ", "Ferry Pebriansyah", "NPM: ", "Kelas: ", "1IA25"]
        print("Data sebelum disisipkan:\n", data)
        npm = input("\nMasukkan NPM: ")
        data.insert(3, npm)
        print("\nData sesudah disisipkan menggunakan method insert():\n", data)

        main()

    elif pil == 6:
        print()
        angka = [5, 0, 4, 2, 2, 5, 7, 2]
        print("List: ", angka)
        print("Banyaknya elemen dengan nilai yang sama dengan menggunakan method count() adalah: "
        ,angka.count(5) + angka.count(2))

        main()

    elif pil == 7:
        print()
        penyanyi = ["Chris Martin", "Tim Bergling", "Taylor Swift", "Louis Armstrong"]
        print("List sebelum dikurangkan:\n", penyanyi)
        hapus = input("\nMasukkan nama dalam list yang ingin dihapus: ")
        penyanyi.remove(hapus)
        print("\nList sesudah dikurangkan menggunakan method remove():\n", penyanyi)

        main()

    elif pil == 8:
        print()
        penyanyi = ["Chris Martin", "Tim Bergling","Taylor Swift", "Louis Armstrong"]
        print("List sebelum dikurangkan:\n", penyanyi)
        hapus = int(input("\nMasukkan indeks dalam list yang ingin dihapus (0-3): "))
        penyanyi.pop(hapus)
        print("\nList sesudah dikurangkan menggunakan method pop():\n", penyanyi)

        main()

    elif pil == 9:
        print("Selamat Tinggal....")
        exit()

    else:
        print("Pilih yang bener dong...")


main()

