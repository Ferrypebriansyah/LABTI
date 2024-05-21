#include <iostream>
#include <cmath>

using namespace std;

class Calculator {
public:
    double tambah(double a, double b) {
        return a + b;
    }

    double kurang(double a, double b) {
        return a - b;
    }

    double kali(double a, double b) {
        return a * b;
    }

    double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            cerr << "Error: Tidak bisa membagi oleh nol." << endl;
            return 0;
        }
    }

    double pangkat(double a, double b) {
        return pow(a, b);
    }

    double faktorial(int n) {
        if (n < 0) {
            cerr << "Error: Faktorial dari bilangan negatif tidak terdefinisi." << endl;
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
};

int main() {
    Calculator kalkulator;
    double angka1, angka2;
    int pilihan;

    // Meminta input angka pertama
    cout << "Masukkan angka pertama: ";
    cin >> angka1;

    // Meminta input angka kedua
    cout << "Masukkan angka kedua: ";
    cin >> angka2;

    cout << "Pilih operasi: \n";
    cout << "1. Tambah\n";
    cout << "2. Kurang\n";
    cout << "3. Kali\n";
    cout << "4. Bagi\n";
    cout << "5. Pangkat\n";
    cout << "6. Faktorial\n";
    cout << "Pilihan: ";
    cin >> pilihan;

    switch (pilihan) {
        case 1:
            cout << "Hasil: " << kalkulator.tambah(angka1, angka2) << endl;
            break;
        case 2:
            cout << "Hasil: " << kalkulator.kurang(angka1, angka2) << endl;
            break;
        case 3:
            cout << "Hasil: " << kalkulator.kali(angka1, angka2) << endl;
            break;
        case 4:
            cout << "Hasil: " << kalkulator.bagi(angka1, angka2) << endl;
            break;
        case 5:
            cout << "Hasil: " << kalkulator.pangkat(angka1, angka2) << endl;
            break;
        case 6:
            cout << "Hasil: " << kalkulator.faktorial(static_cast<int>(angka1)) << endl;
            break;
        default:
            cerr << "Error: Pilihan operasi tidak valid." << endl;
            break;
    }

    return 0;
}
