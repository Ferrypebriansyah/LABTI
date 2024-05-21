#include <iostream>
#include <string>
#include <fstream>
#include <stdlib.h>
#include <conio.h>
using namespace std;
double keliling();
double luas();
char pilihan;
int pil;

double keliling(){

    cout<<"====KELILING PERSEGI PANJANG===="<<endl;
    cout<<"================================"<<endl;
    double pjg,tgg;
    cout<<"MASUKKAN PANJANG :";
    cin>>pjg;
    cout<<"MASUKKAN TINGGI : ";
    cin>>tgg;
    double kel = 2*(pjg+tgg);
    cout<<"KELILINGNYA SEGINI : "<<kel<<endl;
    return kel;
}

double luas(){
    double pjg,tgg;
    cout<<"====LUAS PERSEGI PANJANG===="<<endl;
    cout<<"============================"<<endl;
    cout<<"MASUKKAN PANJANG :";
    cin>>pjg;
    cout<<"MASUKKAN TINGGI : ";
    cin>>tgg;
    double lu = pjg*tgg;
    cout<<"LUASNYA SEGINI : "<<lu<<endl;
    return lu;
}

struct {
  int myNum;
  string myString;
} myStructure;

int main(){


    do
    {

        cout<<"====PROGRAM C++===="<<endl;
        cout<<"==================="<<endl;
        cout<<"1. GANJIL DAN GENAP"<<endl;
        cout<<"2. POINTER"<<endl;
        cout<<"3. Segitiga LUNGLUNG"<<endl;
        cout<<"4. Segitiga LUAS"<<endl;
        cout<<"5. Operasi file"<<endl;
        cout<<"6. SEGITIGA 1"<<endl;
        cout<<"7. SEGITIGA 2"<<endl;
        cout<<"8.Struct"<<endl;
        cout<<"==================="<<endl;
        cout<<"==================="<<endl;
        cout<<"PILIH COK : ";
        cin>> pil;
        switch (pil)
    {
    case 1:
        cout<<"====GANJIL GENAP===="<<endl;
        cout<<"================================"<<endl;
        int angka;
        cout<<"MASUKIN NAPA :";
        cin>>angka;
        if (angka%2 == 0)
        {
            cout<<"GENAP INI"<<endl;
        }else {cout<<"GANJIL INI"<<endl;}
        
        break;
    
    case 2:{
        int var = 5;

        // declare pointer variable
        int* pointVar;

        // store address of var
        pointVar = &var;

        // print value of var
        cout << "var = " << var << endl;

        // print address of var
        cout << "Address of var (&var) = " << &var << endl
         << endl;

        // print pointer pointVar
        cout << "pointVar = " << pointVar << endl;

        // print the content of the address pointVar points to
        cout << "Content of the address pointed to by pointVar (*pointVar) = " << *pointVar << endl;
    
        break;}
    case 3:
        keliling();
        break;
    case 4:
        luas();

    case 5: {
        //stream untuk membaca filecout<<"KASIH NAMA";
        string myfile,isi, line;
        cout<<"KASIH NAMA : ";
        cin>>myfile;
        cin.ignore();

        ofstream fileOutput(myfile,ios::app);
        if (!fileOutput.is_open()){
            cout<<"BENER DIKIT NAPAH!!"<<endl;

            return 0;
        }

        cout<<"ISIIN AKU OM : ";
        getline(cin,isi);

        fileOutput<<isi<<endl;

        ifstream fileInput(myfile);
        if (!fileInput.is_open()){
            cout<<"NGGAK BISA COOY"<<endl;
            return 0;
        }

        cout<<"ISINYA ADALAH "<<endl;
        while(getline(fileInput,line)){
            cout<<line<<endl;
        }
        break;

    }
    case 6:
    {
    int n;
    cout<<"MASUKKAN PANJANG SEGITIGA : ";
    cin>> n;

    //segitiga pola 1
    cout<<"SEGITIGA POLA 1"<<endl;
    for (int i = 0; i < n; i++)
    {
        for(int j = 0; j <= i; j++){
            cout<<"*";
        }
        cout<<endl;
    }
    
    break;
   }
    case 7:
    {
    int n;
    cout<<"MASUKKAN PANJANG SEGITIGA : ";
    cin>> n;

    //segitiga pola 1
    cout<<"SEGITIGA POLA 2"<<endl;
    for (int i = n; i > 0 ; i--)
    {
        for(int j = i; j > 0 ; j--){
            cout<<"*";
        }
        cout<<endl;
    }
    
    break;
   
    }

    case 8:{
    myStructure.myNum = 1;
    myStructure.myString = "Hello World!";

    cout << myStructure.myNum << "\n";
    cout << myStructure.myString << "\n";
    
    break;
    }
    

    default:
        cout<<pil<<" SAHA INI ANYING"<<endl;
        break;
    }


    cout<<"MAU LANJUT NGGAK NIEEH [Y untuk lanjut bujang]: ";
    cin>>pilihan;
    } while (pilihan == 'Y' || pilihan == 'y');

    cout<<"MAKASIH EAAAK"<<endl;
    return 0;

}

