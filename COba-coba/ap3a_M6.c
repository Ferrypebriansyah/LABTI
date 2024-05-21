//Ferry Pebriansyah
//50422572
//2IA26

#include <stdio.h>
#include <string.h>

int main() {
    char nama[50];
	printf("Input Nama: ");
    fgets(nama, sizeof(nama), stdin);
    
    int n;
    printf("Masukkan banyak nilai: ");
    scanf("%d", &n);

    printf("\nNama: %s", nama);
    printf("\nHasil Perhitungan: \n");
    
    int total = 0;
    for (int i = 1; i <= n; i++) {
        int baris = 0; 
        for (int j = 1; j <= i; j++) {
            printf("%d ", n - j + 1);
            if (j < i) {
                printf("+ ");
            }
            baris += (n - j + 1); 
        }
        printf("= %d\n", baris);
        total += baris; 
    }
    return 0;
}


