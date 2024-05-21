#include <iostream>
#include <string>

using namespace std;

int main() {
    string nama, alamat, npm, jurusan;
    int uts, uas, uu, total, hasil;

    cout << "=====================================================" << endl;
    cout << "PROGRAM MENENTUKAN KATEGORI NILAI RATA-RATA MAHASISWA"<<endl;
    cout << "=====================================================" << endl;
    cout << "Masukkan Data Berikut : " << endl;
    cout<<"> Nama      : ";
    getline(cin,nama);
    cout<<"> Alamat    : ";
    getline(cin,alamat);
    cout<<"> NPM       : ";
    getline(cin,npm);
    cout<<"> Jurusan   : ";
    getline(cin, jurusan);
    cout<<"> Nilai UTS : ";
    cin>>uts;
    cout<<"> Nilai UAS : ";
    cin>>uas;
    cout<<"> Nilai UU  : ";
    cin>>uu;
    total = (uts * 0.7) + (uas * 0.2) + (uu * 0.1);
    cout << "====================================" << endl;
    cout << "DATA MAHASISWA" << endl;
    cout << "====================================" << endl;
    cout << "Nama       : " << nama << endl;
    cout << "Alamat     : " << alamat << endl;
    cout << "NPM        : " << npm << endl;
    cout << "Jurusan    : " << jurusan << endl;
    cout << "Nilai UTS  : " << uts << endl;
    cout << "Nilai UAS  : " << uas << endl;
    cout << "Nilai UU   : " << uu << endl;    

    cout << "Hasil rata-rata : ";  
    hasil = total / 10;

    switch (hasil) {
        case 9:
            cout << "Grade A, " << total << endl;
            break;
        case 8:
            cout << "Grade B, " << total << endl;
            break;
        case 7:
            cout << "Grade C, " << total << endl;
            break;
        case 6:
            cout << "Grade D, " << total << endl;
            break;
        default:
            cout << "Grade E (Tidak Lulus)" << endl;
            break;
    }
    cout << "====================================" << endl;
    cout << endl;
}
