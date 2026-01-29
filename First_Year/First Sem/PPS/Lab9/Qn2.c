/*2. Write a C program to swap two numbers using pointers (Call by reference) */
#include <stdio.h>

void swap(int *x, int *y) {
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

int main() {
    int a, b;

    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);

    swap(&a, &b);

    printf("After swapping:\n");
    printf("a = %d, b = %d\n", a, b);

    return 0;
}
