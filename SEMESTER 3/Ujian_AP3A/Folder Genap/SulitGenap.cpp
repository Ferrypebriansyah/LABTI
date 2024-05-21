//Ferry Pebriansyah
//50422572
//2IA26
//Genap

#include <iostream>
using namespace std;

int main() {
    srand(time(0)); 
    int angkaAcak = rand() % 100 + 1; 
    int tebakAngka;
    int percobaan = 0;
    bool tebakTebakan = false;
    
    cout << "Selamat datang di permainan Tebak Angka!" << endl;
    while (!tebakTebakan) {
        cout << "Tebak angka (1-100): ";
        cin >> tebakAngka;
        percobaan++;        

        if (tebakAngka == angkaAcak){
            tebakTebakan = true;
            cout << "Selamat! Anda menebak dengan benar."<<endl;
            cout << "Anda berhasil menebak dalam " << percobaan << " percobaan";
        }else if (tebakAngka > angkaAcak) {
            cout <<"Tebakan terlalu besar. Coba lagi" <<endl;
        }else{
            cout << "Tebakan terlalu kecil. Coba lagi"<<endl;
        } 
    }
    return 0;
}