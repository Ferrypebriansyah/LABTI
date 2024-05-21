#include <iostream>
using namespace std;

int main() {
    int baris, kolom;
    cout << "-----------------------------------------"<<endl;
    cout << "Masukkan jumlah baris: ";
    cin >> baris;
    cout << "Masukkan jumlah kolom: ";
    cin >> kolom;
    cout << "-----------------------------------------"<<endl;


    cout << "Masukkan nilai untuk setiap elemen array:"<<endl;
    int arr[baris] [kolom];
    for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            cout << "Elemen ke-" <<(i+1)<<","<<(j+1)<< ": ";
            cin >> arr[i][j];
        }
    }
    cout << "------------------------------------------"<<endl;
    cout << "Isi array: \n";
    for (int i = 0; i < baris; i++) {
        cout << "| ";
        for (int j = 0; j < kolom; j++) {
            cout << arr[i][j]<<" ";
        }
        cout << "|";
        cout<<"\n";
    }
    return 0;
}

