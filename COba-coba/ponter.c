#include<stdio.h>
void main()
{
    int i,j, *intptr;i = 890;
    printf("variable i terletak pada memory %p.\n",&i);
    printf("alamai i=%p, menerima nilai %d\n",&i,i);
    intptr = &i;
    printf("alamat intptr= %p, menunjuk ke nilai %d\n",intptr,*intptr);
    j = *intptr; 
    printf("alamat j = %p, menerima nilai %d\n",&j,j);
}