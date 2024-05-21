#include <stdio.h>
#include <string.h>
#include <conio.h>
#include <stdlib.h>

int genap()
{
    int a;
    for(a=1; a<=10; a++)
    {
        if(a%2==0)
        {
            printf("%d\n",a);
        }
    }
}

int ganjil()
{
    int b;
    for(b=1; b<=10; b++)
    {
        if(b%2==1)
        {
            printf("%d\n",b);
        }
    }
}

int main()
{
    int c;
    printf("=============================================\n"
            "        PROGRAM BILANGAN \n"
            "============================================");
    printf("\n1. Genap");
    printf("\n2. Ganjil");
    printf("\n============================================\n");
    printf("\nMasukkan Pilihan : ");
    scanf("%d",&c);
    if(c==1){
        genap();
    }else if(c==2){
        ganjil();
    }else{
        printf("Wrong Input\n");
    }
    return main();
}



