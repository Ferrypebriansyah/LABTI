#include <iostream>

using namespace std;

void cetakPersegiPanjang(int panjang, int lebar) {
    for (int i = 0; i < lebar; ++i) {
        for (int j = 0; j < panjang; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

int main() {
    int panjang, lebar;

    // Meminta input panjang dan lebar (luas)
    cout << "Masukkan panjang persegi panjang: ";
    cin >> panjang;

    cout << "Masukkan lebar persegi panjang: ";
    cin >> lebar;

    // Memanggil fungsi untuk mencetak pola bangun datar
    cetakPersegiPanjang(panjang, lebar);

    return 0;
}
