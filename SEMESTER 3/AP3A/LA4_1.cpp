#include <iostream>
#include <cmath>

using namespace std;

double hitungLuasLingkaran(double radius);
double hitungKelilingLingkaran(double radius);

int main() {
    double radius;
    cout << "Masukkan jari-jari lingkaran: ";
    cin >> radius;

    double luas = hitungLuasLingkaran(radius);
    double keliling = hitungKelilingLingkaran(radius);

    cout << "Luas lingkaran    : " << luas << endl;
    cout << "Keliling lingkaran: " << keliling << endl;

    return 0;
}

double hitungLuasLingkaran(double radius) {
    return M_PI * radius * radius;
}

double hitungKelilingLingkaran(double radius) {
    return 2 * M_PI * radius;
}
