package main

import "fmt"

func main() {
	var (
		pil, uts, uas, tinggi, batas     int
		total                            float64
		nama, npm, kelas, matkul, status string
	)

	fmt.Println("\n================Menu Pilihan================")
	fmt.Println("1. Biodata Nilai")
	fmt.Println("2. Pola Bangun Datar")
	fmt.Println("3. FIZZBUZZ")
	fmt.Print("Masukkan Pilihan[1-3]: ")
	fmt.Scan(&pil)

	switch pil {
	case 1:
		fmt.Println("==============Biodata Nilai==============")
		fmt.Print("Nama	: ")
		fmt.Scan(&nama)
		fmt.Print("Kelas	: ")
		fmt.Scan(&kelas)
		fmt.Print("NPM	: ")
		fmt.Scan(&npm)
		fmt.Print("Matkul	: ")
		fmt.Scan(&matkul)
		fmt.Print("UTS	: ")
		fmt.Scan(&uts)
		fmt.Print("UAS	: ")
		fmt.Scan(&uas)
		total = (float64(uts) + float64(uas)) / 2

		if total >= 90 {
			status = "Lulus, Grade A"
		} else if total >= 80 {
			status = "Lulus, Grade B"
		} else if total >= 70 {
			status = "Lulus, Grade C"
		} else if total >= 60 {
			status = "Lulus, Grade D"
		} else {
			status = "Tidak Lulus, Grade E"
		}

		fmt.Println("==============HASIL==============")
		fmt.Printf("Nama Saya, %s\n", nama)
		fmt.Printf("NPM Saya, %s\n", npm)
		fmt.Printf("Saya dari kelas, %s\n", kelas)
		fmt.Printf("Mata Kuliah %s\n", matkul)
		fmt.Printf("Rata-Rata Nilai %3.2f\n", total)
		fmt.Print("Status ", status)
	case 2:
		fmt.Println("==============Pola Bangun Datar==============")
		fmt.Print("Masukkan tinggi segitiga: ")
		fmt.Scan(&tinggi)

		fmt.Println("\nPola Segitiga: ")
		for i := 1; i <= tinggi; i++ {
			for j := 1; j <= i; j++ {
				fmt.Print("* ")
			}
			fmt.Println()
		}
	case 3:
		fmt.Println("==============Fizz Buzz==============")
		fmt.Print("Masukkan Batas: ")
		fmt.Scan(&batas)
		for i := 1; i <= batas; i++ {
			switch {
			case i%3 == 0 && i%5 == 0:
				fmt.Println("Fizz Buzz")
			case i%3 == 0:
				fmt.Println("Fizz")
			case i%5 == 0:
				fmt.Println("Buzz")
			default:
				fmt.Println(i)
			}
		}
	default:
		fmt.Println("Pilihan Tidak Ada")
	}
}
