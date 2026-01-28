/*Write a C program to add two integers a and b read through the keyboard. Display 
the result using third variable sum*/
#include <stdio.h>

int main() {
    int a, b, sum;
    printf("Enter Two Numbers: ");
    scanf("%d %d", &a, &b);
    sum = a + b;
    printf("%d", sum);
    return 0;
}
