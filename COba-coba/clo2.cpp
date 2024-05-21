#include <iostream>
using namespace std;

int uts, uas, uu, pilih;
double total;
string nama, npm, jurusan, alamat;

void pil1() {
    cout << "========= 1. Melihat Rata-rata Nilai =========" << endl;
    cout << "Hasil rata-rata : ";
    if (total >= 90) {
        cout << "GRADE A, " << total << endl;
    } else if (total >= 80) {
        cout << "GRADE B, " << total << endl;
    } else if (total >= 70) {
        cout << "GRADE C, " << total << endl;
    } else if (total >= 60) {
        cout << "GRADE D, " << total << endl;
    } else {
        cout << "GRADE E, " << total << endl;
    }
}

void pil2() {
    cout << "========= 2. Menginput Data Diri =========" << endl;
    system("cls");
    cout << "DATA MAHASISWA" << endl;
    cout << "Nama       : " << nama << endl;
    cout << "Alamat     : " << alamat << endl;
    cout << "NPM        : " << npm << endl;
    cout << "Jurusan    : " << jurusan << endl;
    cout << endl;
}


int main() {
    cout << "Masukkan data berikut ini, " << endl;
    cout << "Nama      : ";
    cin >> nama;
    cout << "Alamat    : ";
    cin >> alamat;
    cout << "NPM       : ";
    cin >> npm;
    cout << "Jurusan   : ";
    cin >> jurusan;
    cout << endl;
    cout << "Nilai UTS : ";
    cin >> uts;
    cout << "Nilai UAS : ";
    cin >> uas;
    cout << "Nilai UU  : ";
    cin >> uu;

    total = ((uts * 0.7) + (uas * 0.2) + (uu * 0.1));
    cout << endl;

    cout << "========= MENU PILIHAN =========" << endl;
    cout << "1. Melihat Rata-rata Nilai" << endl;
    cout << "2. Menginput Data Diri" << endl;
    cout << "--> Masukkan Pilihan: ";
    cin >> pilih;
    cout << endl;

    switch(pilih){
        case 1: 
        pil1();
        main(); 
        break; 

        case 2: 
        pil2();
        main();
        break; 

        default: 
        cout<<"Terimakasih!!";
}
}