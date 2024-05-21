#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *rantai;
};

// Deklarasi fungsi
int hitung_simpul(struct node *depan);
void cetak_data(struct node *depan);

int main() {
    struct node *depan = malloc(sizeof(struct node));
    depan->data = 504; //ganti npm masing-masing
    depan->rantai = NULL;

    struct node *tengah = malloc(sizeof(struct node));
    tengah->data = 22; //ganti npm masing-masing
    tengah->rantai = NULL;
    depan->rantai = tengah;

    tengah->rantai = malloc(sizeof(struct node)); 
    tengah = tengah->rantai; 
    tengah->data = 572; //ganti npm masing-masing
    tengah->rantai = NULL;

    hitung_simpul(depan);
    cetak_data(depan);
    return 0;
}


int hitung_simpul(struct node *depan) {
    int hitung = 0;
    if (depan == NULL)
        printf("Linked list kosong");
    struct node *tunjuk = depan;
    while (tunjuk != NULL) {
        hitung++;
        tunjuk = tunjuk->rantai;
    }
    printf("\nJumlah Node pada Linked List adalah %d", hitung);
}

void cetak_data(struct node *depan) {
    if (depan == NULL)
        printf("Linked list kosong");
    struct node *tunjuk = depan;
    while (tunjuk != NULL) {
        printf("\nData pada linked list adalah %d", tunjuk->data);
        tunjuk = tunjuk->rantai;
    }
}

