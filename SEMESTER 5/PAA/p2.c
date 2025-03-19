#include<stdio.h>
int a[100];  
int maks, min;  
void maxmin();

int main() {
    int i, num;
    
    printf("\n\t\t\tMaksimum Dan Minimum\n\n");
    printf("Masukkan Banyak Angka: ");
    scanf("%d", &num);
    
    printf("\nMasukkan Angka-angkanya:\n");
    for (i = 0; i < num; i++) {
        scanf("%d", &a[i]);
    }
    
    printf("\nAngka-angkanya adalah:\n");
    for (i = 0; i < num; i++) {
        printf("%d ", a[i]);
    }
    
    maks = a[0];
    min = a[0];
    maxmin(0, num - 1);
    
    printf("\nMaksimum Angka: %d\n", maks);
    printf("Minimum Angka: %d\n", min);   
    return 0;
}

void maxmin(int i, int j) {
    int maks1, min1, mid;
    if (i == j) {
        maks = min = a[i];
    } else if (i == j - 1) {
        if (a[i] > a[j]) {
            maks = a[i];
            min = a[j];
        } else {
            maks = a[j];
            min = a[i];
        }
    } else {
        mid = (i + j) / 2;
        maxmin(i, mid);
        maks1 = maks;
        min1 = min;
        maxmin(mid + 1, j);
        
        if (maks < maks1) 
        maks = maks1;  
        if (min > min1) 
        min = min1;      
    }
}
