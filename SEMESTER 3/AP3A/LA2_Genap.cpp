#include <iostream>
using namespace std;

int main(){
    
    int uts,uas,total,uu,pilih;
    string nama, npm, jurusan, alamat;
    cout<<endl;
    cout << "========= MENU PILIHAN ========="<<endl;
    cout << "1. Melihat Rata-rata Nilai"<<endl;
    cout << "2. Menginput Data Diri"<<endl;
    cout << "3. Exit"<<endl;
    cout << "--> Masukkan Pilihan[1-3]: ";
    cin >> pilih;
    cout<<endl;

    switch(pilih){
        case 1: 
        cout << "========= 1. Melihat Rata-rata Nilai ========="<<endl;
        cout<<"Nilai UTS : ";
        cin>>uts;
        cout<<"Nilai UAS : ";
        cin>>uas;
        cout<<"Nilai UU  : ";
        cin>>uu;

        total = ((uts*0.7)+(uas*0.2)+(uu*0.1));
        cout<<endl;

        cout << "Hasil rata-rata : ";
        if (total >= 90){
            cout << "GRADE A, "<<total<<endl;
        }else if (total >= 80){
            cout << "GRADE B, "<<total<<endl;
        }else if (total >= 70){
            cout << "GRADE C, "<<total<<endl;
        }else if (total >= 60){
            cout << "GRADE D, "<<total<<endl;
        }else{
            cout << "GRADE E, "<<total<<endl;
        }
        main(); 
        break; 

        case 2: 
        cout << "========= 2. Menginput Data Diri ========="<<endl;
        cout<<"Masukkan data berikut ini, "<<endl;
        cout<<"Nama      : ";
        cin>>nama;
        cout<<"Alamat    : ";
        cin>>alamat;
        cout<<"NPM       : ";
        cin>>npm;
        cout<<"Jurusan   : ";
        cin>>jurusan;
        cout<<endl;
        
        cout<<"DATA MAHASISWA"<<endl;
        cout<<"Nama       : "<<nama<<endl;
        cout<<"Alamat     : "<<alamat<<endl;
        cout<<"NPM        : "<<npm<<endl;
        cout<<"Jurusan    : "<<jurusan<<endl;
        main();
        break; 

        default: 
        cout<<"Terimakasih!!";
    }    
}