/*1. Find the maximum number in the input integer array using pointers. */
#include <stdio.h>

int main() {
    int a[10], n, i;
    int *p, max;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    p = a;
    max = *p;

    for(i = 1; i < n; i++) {
        if(*(p + i) > max)
            max = *(p + i);
    }

    printf("Maximum element = %d\n", max);
    return 0;
}
