package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
)

// Mahasiswa
type inputMahasiswa struct {
	ID       int    `json:"id"`
	Name     string `json:"name"`
	NIM      int    `json:"nim"`
	Kelas    string `json:"kelas"`
	Fakultas string `json:"fakultas"`
	Jurusan  string `json:"jurusan"`
}

// NewMahasiswa
func NewMahasiswa() []inputMahasiswa {
	mhs := []inputMahasiswa{
		inputMahasiswa{
			ID:       1,
			Name:     "Ferry",
			NIM:      50422572,
			Kelas:    "2IA26",
			Fakultas: "Teknologi Industri",
			Jurusan:  "Informatika",
		},
		inputMahasiswa{
			ID:       2,
			Name:     "Pebriansyah",
			NIM:      50422275,
			Kelas:    "2IA25",
			Fakultas: "Teknologi Industri",
			Jurusan:  "Informatika",
		},
		inputMahasiswa{
			ID:       3,
			Name:     "Ferry Benzema",
			NIM:      50422725,
			Kelas:    "1IA27",
			Fakultas: "Teknologi Industri",
			Jurusan:  "Informatika",
		},
	}
	return mhs
}

// GetMahasiswa
func GetMahasiswa(w http.ResponseWriter, r *http.Request) {
	if r.Method == "GET" {
		mhs := NewMahasiswa()
		datamahasiswa, err := json.Marshal(mhs)
		if err != nil {
			http.Error(w, err.Error(),
				http.StatusInternalServerError)
		}
		w.Header().Set("Content-Type", "application/json")
		w.WriteHeader(http.StatusOK)
		w.Write(datamahasiswa)
		return
	}

	http.Error(w, "wkwk gagal", http.StatusNotFound)
}

func main() {
	http.HandleFunc("/mahasiswa", GetMahasiswa)
	fmt.Println("server running...")
	if err := http.ListenAndServe(":8000", nil); err != nil {
		log.Fatal(err)
	}
}
