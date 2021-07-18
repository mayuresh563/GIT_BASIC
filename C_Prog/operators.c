#include<stdio.h>
int main()
{
    int a, b;
    printf("Enter number a\n");
    scanf("%d", &a);

    printf("Enter number b\n");
    scanf("%d", &b);

    printf("The sum is : %d\n", a+b);
    printf("The difference is : %d\n", a-b);
    printf("The product is : %d\n", a*b);
    printf("The division is : %d\n", a/b);
    return 0;
}