package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
	"strconv"
)

// Mahasiswa
type Mahasiswa struct {
	ID       int    `json:"id"`
	Name     string `json:"name"`
	NIM      int    `json:"nim"`
	Kelas    string `json:"kelas"`
	Fakultas string `json:"fakultas"`
	Jurusan  string `json:"jurusan"`
}

// PostMahasiswa
func APIMahasiswa(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	var Mhs Mahasiswa

	if r.Method == "POST" {
		if r.Header.Get("Content-Type") == "application/json" {
			decodeJSON := json.NewDecoder(r.Body)
			if err := decodeJSON.Decode(&Mhs); err != nil {
				log.Fatal(err)
			}
		} else {
			// parse dari form
			getID := r.PostFormValue("id")
			id, _ := strconv.Atoi(getID)
			getNim := r.PostFormValue("nim")
			nim, _ := strconv.Atoi(getNim)
			name := r.PostFormValue("name")
			kelas := r.PostFormValue("kelas")
			fakultas := r.PostFormValue("fakultas")
			jurusan := r.PostFormValue("jurusan")
			Mhs = Mahasiswa{
				ID:       id,
				Name:     name,
				NIM:      nim,
				Kelas:    kelas,
				Fakultas: fakultas,
				Jurusan:  jurusan,
			}
		}

		datamahasiswa, _ := json.Marshal(Mhs) // to byte
		w.Write(datamahasiswa)                // cetak di browser
		return
	}

	http.Error(w, "hahahaha error..........", http.StatusNotFound)
	return
}

func main() {
	http.HandleFunc("/api_mahasiswa", APIMahasiswa)
	fmt.Println("server running...")
	if err := http.ListenAndServe(":8081", nil); err != nil {
		log.Fatal(err)
	}
}
