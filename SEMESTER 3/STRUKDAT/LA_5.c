#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#define MAX 8

int queue_arr[MAX];
int rear = -1;
int front = -1;

void insert() {
    int added_item;
    if (rear == MAX - 1)
        printf("Queue Overflow!! \n");
    else {
        if (front == -1)
            front = 0;
        printf("Masukkan Elemen Kedalam Queue : ");
        scanf("%d", &added_item);
        rear = rear + 1;
        queue_arr[rear] = added_item;
    }
}

void del() {
    if (front == -1 || front > rear) {
        printf("Queue Underflow\n");
        return;
    } else {
        printf("Element Deleted From Queue is : %d\n", queue_arr[front]);
        front = front + 1;
    }
}

void display() {
    int i;
    if (front == -1)
        printf("Queue Kosong !\n");
    else {
        printf("Queue : \n");
        for (i = front; i <= rear; i++)
            printf("%d ", queue_arr[i]);
        printf("\n");
    }
}

int main() {
    int choice;
    while (1) {
        printf("\n\n");
        printf("+=====================+\n");
        printf("|      Menu Utama     |\n");
        printf("+=====================+\n");
        printf("| 1. Insert Queue     |\n");
        printf("| 2. Delete Queue     |\n");
        printf("| 3. Display Queue    |\n");
        printf("| 4. Exit             |\n");
        printf("+=====================+\n");
        printf("Masukkan Pilihan : ");
        scanf("%d", &choice);

        printf("\n\n");

        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                del();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Salah Memasukkan Pilihan ! \n");
        }
    }
}
