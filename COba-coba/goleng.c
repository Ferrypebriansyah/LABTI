#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct node{
        struct node *prev;
        int data;
        struct node *next;
};

typedef struct node node;
node *pHead = NULL;

node *alokasiNodeBaru(){
    node *pNew = NULL;
    pNew = (node *) malloc(sizeof(node));
return(pNew);
}

void tambahAwal(node *pNew){
        printf("masukkan bilangan: "); scanf("%d",&pNew -> data);

        if(pHead == NULL){
                pNew -> prev = pHead;
                pNew -> next = pHead;
                pHead = pNew;
        }
        else{
                //cari node yang menunjuk ke pHead6
                pNew->prev = pHead;
                pNew->next = pHead;
                pHead->prev = pNew;
                pHead = pNew;
        }
}

void cetak(){
        node *pWalker = pHead; int i=1;
        while(pWalker!=NULL){
                printf("node ke-%d = %d\n",i,pWalker->data);
        i++;
        pWalker=pWalker->next;
        }
        printf("NULL\n");
}

void hapusAkhir(){
     node *pEnd;
pEnd=pHead;
while(pEnd->next!=NULL){
                                pEnd=pEnd->next;
                                }
pEnd->prev->next=NULL;
free(pEnd);
}

int main(int argc, char *argv[]){
    node *pNew; int pilih,bil;
    do{system("cls");
        printf("\n----------MENU----------");
        printf("\n1.tambah awal");
        printf("\n2.hapus akhir");
        printf("\n3.cetak");
        printf("\n4.exit");
        printf("\npilihan : ");scanf("%d",&pilih);

        if(pilih==1){pNew=alokasiNodeBaru();
                        tambahAwal(pNew);
                        }
        else if(pilih==2){hapusAkhir();}
        else if(pilih==3){cetak();getch();}
    }while(pilih!=4);
        printf("\n");
        system("PAUSE");
        return 0;
}