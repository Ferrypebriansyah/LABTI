package main

import "fmt"

type mahasiswa struct{
	nama string
	npm string
	jurusan string
}

func main(){
	var jumlahmhs int
	fmt.Print("\nMasukan jumlah mahasiswa: ")
	fmt.Scan(&jumlahmhs)

	mahasiswa := make([]mahasiswa, jumlahmhs)

	for i := 0; i<len(mahasiswa);i++{
		fmt.Println("========================")
		fmt.Printf("Data Mahasiswa %d:\n", i+1)
		fmt.Print("Nama	: ")
		fmt.Scan(&mahasiswa[i].nama)
		fmt.Print("NPM	: ")
		fmt.Scan(&mahasiswa[i].npm)
		fmt.Print("Jurusan	: ")
		fmt.Scan(&mahasiswa[i].jurusan)
	}
	fmt.Println("========================")
	fmt.Println("************************")
	fmt.Println("Rekap Data Mahasiswa:")
	for i:=0;i<len(mahasiswa);i++{
		fmt.Println("************************")
		mahasiswaptr:=&mahasiswa[i]
		fmt.Printf("Nama	: %s\n", mahasiswaptr.nama)
		fmt.Printf("NPM	: %s\n", mahasiswaptr.npm)
		fmt.Printf("Jurusan	: %s\n", mahasiswaptr.jurusan)
	}
	fmt.Println("************************")
}

