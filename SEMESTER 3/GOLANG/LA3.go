package main

import (
	"database/sql"
	"fmt"
	"log"

	_ "github.com/go-sql-driver/mysql"
)

func main(){
	db, err := sql.Open("mysql", "root:@tcp(localhost:3306)/pert3_ap3b")
	if err != nil{
		log.Fatal(err)
	}
	defer db.Close()

	err =db.Ping()
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println("connected to the database")

	var nama, nim, jurusan, alamat string
	fmt.Print("Masukkan Nama		: ")
	fmt.Scanln(&nama) 

	fmt.Print("Masukkan NIM		: ")
	fmt.Scanln(&nim)

	fmt.Print("Masukkan Jurusan	: ")
	fmt.Scanln(&jurusan)

	fmt.Print("Masukkan Alamat		: ")
	fmt.Scanln(&alamat)

	_, err = db.Exec("INSERT INTO datamhs(nama, nim, jurusan, alamat) VALUES (?, ?, ?, ?)", nama, nim, jurusan, alamat)
	if err != nil{
		log.Fatal(err)
	}
	fmt.Println("\nData mahasiswa inserted succesfully")

	rows, err := db.Query("SELECT nama, nim, jurusan, alamat FROM datamhs")
	if err != nil{
		log.Fatal(err)
	}
	defer rows.Close()

	fmt.Println("Biodata mahasiswa from the database: ")
	for rows.Next(){
		var nama, nim, jurusan, alamat string
		err := rows.Scan(&nama, &nim, &jurusan, &alamat)
		if err != nil {
			log.Fatal(err)
		}
		fmt.Printf("Nama: %s, NIM: %s, Jurusan: %s, Alamat: %s\n", nama, nim, jurusan, alamat)
	}
}
