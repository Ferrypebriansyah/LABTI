#include <stdio.h>
#include <stdlib.h>

struct node {
    struct node* prev;
    int data;
    struct node* next;
};

typedef struct node node;
node* pHead = NULL;

node* alokasiNodeBaru() {
    node* pNew = (node*)malloc(sizeof(node));
    pNew->prev = NULL;
    pNew->next = NULL;
    return pNew;
}

void tambahanAwal(node* pNew) {
    printf("masukkan bilangan: ");
    scanf("%d", &pNew->data);

    if (pHead == NULL) {
        pHead = pNew;
    } else {
        pNew->next = pHead;
        pHead->prev = pNew;
        pHead = pNew;
    }
}

void cetak() {
    node* pWalker = pHead;
    int i = 1;
    while (pWalker != NULL) {
        printf("node ke-%d = %d\n", i, pWalker->data);
        i++;
        pWalker = pWalker->next;
    }
    printf("NULL\n");
}

void hapusAkhir() {
    if (pHead == NULL) {
        return; // List is empty, nothing to delete.
    }

    node* pEnd = pHead;
    while (pEnd->next != NULL) {
        pEnd = pEnd->next;
    }

    if (pEnd->prev != NULL) {
        pEnd->prev->next = NULL;
    } else {
        // This is the last element in the list.
        pHead = NULL;
    }

    free(pEnd);
}

int main(int argc, char* argv[]) {
    node* pNew;
    int pilih;

    do {
        system("cls");
        printf("\n----------MENU----------");
        printf("\n1.tambah awal");
        printf("\n2.hapus akhir");
        printf("\n3.cetak");
        printf("\n4.exit");
        printf("\npilihan : ");
        scanf("%d", &pilih);

        if (pilih == 1) {
            pNew = alokasiNodeBaru();
            tambahanAwal( );
            
        } else if (pilih == 2) {
            hapusAkhir();
        } else if (pilih == 3) {
            cetak();
            system("pause");
        }
    } while (pilih != 4);

}