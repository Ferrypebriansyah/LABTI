//Ferry Pebriansyah
//50422572
//2IA26
//Genap

#include <iostream>
using namespace std;

void cetakSegitiga(int tinggi) {
    for (int i = 1; i <= tinggi; ++i) {
        for (int j = 1; j <= i; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

void cetakPersegi(int sisi) {
    for (int i = 0; i < sisi; ++i) {
        for (int j = 0; j < sisi; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

int main() {
    int tinggiSegitiga, sisiPersegi;

    cout << "Masukkan tinggi segitiga: ";
    cin >> tinggiSegitiga;

    cout << "Masukkan sisi persegi: ";
    cin >> sisiPersegi;

    cout << "\nPola Segitiga:\n";
    cetakSegitiga(tinggiSegitiga);

    cout << "\nPola Persegi:\n";
    cetakPersegi(sisiPersegi);

    return 0;
}
