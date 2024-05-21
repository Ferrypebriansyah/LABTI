#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    srand(time(0)); 
    int angkaRandom = rand() % 100 + 1; 
    int tebakan;
    int percobaan = 0;
    bool tebakanBenar = false;

    cout << "Selamat datang di permainan Tebak Angka!" << endl;
    cout << "Saya telah memilih angka antara 1 sampai 100. Cobalah menebaknya." << endl;

    while (!tebakanBenar) {
        cout << "Masukkan tebakan Anda: ";
        cin >> tebakan;
        percobaan++;

        if (tebakan == angkaRandom) {
            tebakanBenar = true;
            cout << "Selamat! Anda berhasil menebak angka " << angkaRandom << " dengan " << percobaan << " percobaan." << endl;
        } else if (tebakan < angkaRandom) {
            cout << "Tebakan terlalu rendah. Coba lagi." << endl;
        } else {
            cout << "Tebakan terlalu tinggi. Coba lagi." << endl;
        }
    }

    return 0;
}