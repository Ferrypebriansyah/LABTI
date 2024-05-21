#include <iostream>

using namespace std;

void cetakSegitigaDiamond(int tinggi) {
    for (int i = 1; i <= tinggi; ++i) {
        for (int j = 1; j <= tinggi - i; ++j) {
            cout << " ";
        }
        for (int k = 1; k <= 2 * i - 1; ++k) {
            cout << "*";
        }
        cout << endl;
    }

    for (int i = tinggi - 1; i >= 1; --i) {
        for (int j = 1; j <= tinggi - i; ++j) {
            cout << " ";
        }
        for (int k = 1; k <= 2 * i - 1; ++k) {
            cout << "*";
        }
        cout << endl;
    }
}

void cetakSegitigaKiri(int tinggi) {
    for (int i = 1; i <= tinggi; ++i) {
        for (int j = 1; j <= i; ++j) {
            cout << "*";
        }
        cout << endl;
    }
}

void cetakSegitigaKanan(int tinggi) {
    for (int i = 1; i <= tinggi; ++i) {
        for (int j = 1; j <= tinggi - i; ++j) {
            cout << " ";
        }
        for (int k = 1; k <= i; ++k) {
            cout << "*";
        }
        cout << endl;
    }
}

void cetakSegitigaSempurna(int tinggi) {
    for (int i = 1; i <= tinggi; ++i) {
        for (int j = 1; j <= tinggi - i; ++j) {
            cout << " ";
        }
        for (int k = 1; k <= 2 * i - 1; ++k) {
            cout << "*";
        }
        cout << endl;
    }
}

int main() {
    int tinggi, pilihan;

    do {
        // Menampilkan menu
        cout << "\n=== Menu ===" << endl;
        cout << "1. Segitiga Diamond" << endl;
        cout << "2. Segitiga Kiri" << endl;
        cout << "3. Segitiga Kanan" << endl;
        cout << "4. Segitiga Sempurna" << endl;
        cout << "0. Keluar" << endl;

        // Meminta input pilihan dari pengguna
        cout << "Pilihan: ";
        cin >> pilihan;

        // Melakukan aksi sesuai pilihan pengguna
        switch (pilihan) {
            case 1:
                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;
                cetakSegitigaDiamond(tinggi);
                break;
            case 2:
                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;
                cetakSegitigaKiri(tinggi);
                break;
            case 3:
                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;
                cetakSegitigaKanan(tinggi);
                break;
            case 4:
                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;
                cetakSegitigaSempurna(tinggi);
                break;
            case 0:
                cout << "Program berakhir.\n";
                break;
            default:
                cout << "Pilihan tidak valid. Coba lagi.\n";
        }
    } while (pilihan != 0);

    return 0;
}
