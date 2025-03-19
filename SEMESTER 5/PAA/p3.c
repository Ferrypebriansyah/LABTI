#include <stdio.h>

int kunci(int a[], int i, int N,int jumlah, int K) {
    if (i >= N) return jumlah == K;
    int opsi1 = kunci(a, i + 1, N, jumlah + a[i], K);
    int opsi2 = kunci(a, i + 1, N, jumlah, K);
    return opsi1 || opsi2;
}

int jumSubhimpunan(int a[], int N, int K) {
    return kunci(a, 0, N, 0, K);
}

int main() {
    int a[] = {5, 0, 4, 2, 2, 5, 7, 2};
    int N = 8;
    int K = 50;
    
    if(jumSubhimpunan(a, N, K))
        printf("Terdapat ada subhimpunan yang jumalahnya %d\n", K);
    else
        printf("Tidak ada subhimpunan yang jumalahnya %d\n", K);
        
    return 0;
}