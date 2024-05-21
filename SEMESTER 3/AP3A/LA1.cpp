#include <iostream>
#include <string>

using namespace std;

int main(){
    string nama, alamat, npm, jurusan;
    int uts, uas, uu, total;


    cout<<"Masukkan data berikut: "<<endl<<endl;
    cout<<"Nama      : ";
    getline(cin,nama);

    cout<<"Alamat    : ";
    getline(cin,alamat);

    cout<<"NPM       : ";
    getline(cin,npm);

    cout<<"Jurusan   : ";
    getline(cin, jurusan);

    cout<<"Nilai UTS : ";
    cin>>uts;

    cout<<"Nilai UAS : ";
    cin>>uas;

    cout<<"Nilai UU  : ";
    cin>>uu;

    total = (uts+uas+uu)/3;

    cout<<endl;
    cout<<"======================="<<endl;
    cout<<"DATA MAHASISWA"<<endl;
    cout<<"======================="<<endl;

    cout<<"Nama       : "<<nama<<endl;
    cout<<"Alamat     : "<<alamat<<endl;
    cout<<"NPM        : "<<npm<<endl;
    cout<<"Jurusan    : "<<jurusan<<endl;
    cout<<"Nilai UTS  : "<<uts<<endl;
    cout<<"Nilai UAS  : "<<uas<<endl;
    cout<<"Nilai UU   : "<<uu<<endl;
    cout<<"Total      : "<<total<<endl;
}


