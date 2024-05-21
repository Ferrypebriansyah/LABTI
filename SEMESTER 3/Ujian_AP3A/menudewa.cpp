#include <iostream>
#include <conio.h>
#include <time.h>
#include <stdlib.h>
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

    double pangkat(int a, double b) {
        return pow(a,b);
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

void cetakPersegiPanjang(int panjang, int lebar) {
    for (int i = 0; i < lebar; ++i) {
        for (int j = 0; j < panjang; ++j) {
            cout << "* ";
        }
        cout << endl;
    }
}

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

int main() {
    int pilihanMenu, tinggi;
    double angka1, angka2;
    int pilihanKalkulator;

    do {
        cout << "=== Menu ===\n";
        cout << "1. Bangun Datar\n";
        cout << "2. Segitiga\n";
        cout << "3. Kalkulator\n";
        cout << "4. Suit\n";
        cout << "0. Keluar\n";
        cout << "Pilihan Menu: ";
        cin >> pilihanMenu;

        switch (pilihanMenu) {
            case 1:
                // Bangun Datar
                int panjang, lebar;
                cout << "\n=== Bangun Datar ===\n";
                cout << "1. Persegi Panjang\n";
                cout << "Masukkan panjang persegi panjang: ";
                cin >> panjang;
                cout << "Masukkan lebar persegi panjang: ";
                cin >> lebar;
                cetakPersegiPanjang(panjang, lebar);
                break;

            case 2:
                // Segitiga
                cout << "\n=== Segitiga ===\n";
                cout << "1. Segitiga Diamond\n";
                cout << "2. Segitiga Kiri\n";
                cout << "3. Segitiga Kanan\n";
                cout << "4. Segitiga Sempurna\n";
                cout << "Pilih segitiga: ";
                cin >> pilihanKalkulator;
                cout << "Masukkan tinggi segitiga: ";
                cin >> tinggi;
                switch (pilihanKalkulator) {
                    case 1:
                        cetakSegitigaDiamond(tinggi);
                        break;
                    case 2:
                        cetakSegitigaKiri(tinggi);
                        break;
                    case 3:
                        cetakSegitigaKanan(tinggi);
                        break;
                    case 4:
                        cetakSegitigaKiri(tinggi);
                        break;
                    default:
                        cout << "Pilihan tidak valid.\n";
                        break;
                }
                break;

            case 3:
                // Kalkulator
                cout << "\n=== Kalkulator ===\n";
                Calculator kalkulator;
                cout << "Masukkan angka pertama: ";
                cin >> angka1;
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
                cin >> pilihanKalkulator;

                switch (pilihanKalkulator) {
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
                        cout << "Pilihan operasi tidak valid.\n";
                        break;
                }
                break;

            case 4:
                // Suit
                cout << "\n=== Suit ===\n";
                int acak, pilihanSuit;
                srand(time(NULL));
                suit_awal:
                    acak = rand()%3;
                    cout << "1. Batu\n";
                    cout << "2. Kertas\n";
                    cout << "3. Gunting\n";
                    cout << "4. Keluar\n";
                    cout << "Masukan Pilihan Anda: ";
                    cin >> pilihanSuit;

                    if (pilihanSuit >= 1 && pilihanSuit <= 3) {
                        cout << "\nPilihan Kamu\t\t: ";
                        switch (pilihanSuit) {
                            case 1:
                                cout << "Batu\n";
                                break;
                            case 2:
                                cout << "Kertas\n";
                                break;
                            case 3:
                                cout << "Gunting\n";
                                break;
                        }

                        cout << "Pilihan Komputer\t: ";
                        switch (acak) {
                            case 0:
                                cout << "Batu\n";
                                break;
                            case 1:
                                cout << "Kertas\n";
                                break;
                            case 2:
                                cout << "Gunting\n";
                                break;
                        }

                        if (pilihanSuit == acak) {
                            cout << "\n\t - DRAW -";
                        } else if ((pilihanSuit == 1 && acak == 2) || (pilihanSuit == 2 && acak == 0) || (pilihanSuit == 3 && acak == 1)) {
                            cout << "\n\t - KAMU KALAH :P :P :P :P -";
                        } else {
                            cout << "\n\t - KAMU MENANG T_T T_T T_T -";
                        }
                    } else if (pilihanSuit == 4) {
                        cout << "\n\n TERIMA KASIH TELAH BERMAIN, KAPAN-KAPAN MAIN LAGI YA ";
                        getch();
                        return 0;
                    } else {
                        cout << "\n Pilihan yang Anda masukkan tidak valid.\n";
                    }

                    getch();
                    system("cls");
                    goto suit_awal;

            case 0:
                cout << "Keluar dari program.\n";
                break;

            default:
                cout << "Pilihan tidak valid. Coba lagi.\n";
                break;
        }
    } while (pilihanMenu != 0);

    return 0;
}
