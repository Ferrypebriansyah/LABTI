#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    string namaFile;
    string konten;

    cout << "Masukkan nama file: ";
    cin >> namaFile;

    ofstream file(namaFile);

    if (!file.is_open()) {
        cout << "Gagal membuka file." << endl;
        return 1;
    }

    cin.ignore(); 

    cout << "Masukkan konten untuk ditulis ke file:" << endl;
    getline(cin, konten);

    file << konten;
    file.close();

    cout << "\nIsi file:" << endl;

    ifstream readFile(namaFile);
    if (readFile.is_open()) {
        string line;
        while (getline(readFile, line)) {
            cout << line << endl;
        }
        readFile.close();
    } else {
        cout << "Gagal membaca file." << endl;
    }

    return 0;
}
