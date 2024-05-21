/*
Nama    : Ferry Pebriansyah
NPM     : 50422572
kelas   : 2IA26
*/

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct node{
	int data;
	struct node *rantai;
};

int main()
{
	struct node *depan = malloc(sizeof(struct node));
	depan->data = 504; // isi yang dititik-titik
	depan->rantai = NULL;
	
	struct node *tengah = malloc(sizeof(struct node));
	tengah->data = 22; // isi yang dititik-titik
	tengah->rantai = NULL;
	depan->rantai = tengah;
	
	tengah = malloc(sizeof(struct node));
	tengah->data = 572; // isi yang dititik-titik
	tengah->rantai = NULL;
	
	depan->rantai->rantai = tengah;
	int pilihan;
	printf("\n======================================================\n"
        	"               PROGRAM ARRAY \n"
        	"======================================================\n\n");
	printf("\n1. Hitung Simpul");
	printf("\n2. Cetak Data ");
	printf("\n3. Exit ");
	printf("\n======================================================\n");
	printf("\nMasukkan Pilihan : ");
	scanf("%d", &pilihan); // isi yang dititik-titik
	if(pilihan == 1){ // isi yang dititik-titik
		int hitung = 0;
		if(depan == NULL) // isi yang dititik-titik
			printf("Linked list kosong");
		struct node *tunjuk = NULL;
		tunjuk = depan;
		while(tunjuk != NULL){
			hitung++;
			tunjuk = tunjuk->rantai;
		}
		printf("Jumlah Node pada Linked List adalah %d", hitung);
	}else if(pilihan == 2){ // isi yang dititik-titik
		if(depan == NULL) // isi yang dititik-titik
			printf("Linked list kosong");
		struct node *tunjuk = NULL;
		tunjuk = depan;
		while(tunjuk != NULL){
			printf("\nData pada linked list adalah %d", tunjuk->data);
			tunjuk = tunjuk->rantai;
		}
	}else if(pilihan == 3){ // isi yang dititik-titik
		return 0;
	}else{
		printf("Wrong Input\n");
	}
	return main();
}
