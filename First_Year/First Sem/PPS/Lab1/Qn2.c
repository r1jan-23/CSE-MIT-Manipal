/*2. Write a C program to find the sum, difference, product and quotient of 2 numbers. */
#include <stdio.h>

int main() {
    int a, b;
    printf("Enter Two Number to find the sum, difference, product and quotient : ");
    scanf("%d %d", &a, &b);
    printf("%d\n", a + b);
    printf("%d\n", a - b);
    printf("%d\n", a * b);
    printf("%f\n", (float)a / b);
    return 0;
}
