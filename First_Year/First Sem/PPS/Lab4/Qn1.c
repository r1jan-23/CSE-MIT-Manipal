/*1. Generate the multiplication table for ‘n’ numbers up to ‘k’ terms (using nested for 
loops). 
[ Hint: 1 2 3 4 5   ….    k 
2   4   6   8  10  ….2*k 
..………………..… 
n………………  n*k ] 
*/
#include <stdio.h>

int main() {
    int n, k, i, j;
    printf("Enter value of n: ");
    scanf("%d", &n);
    printf("Enter value of k: ");
    scanf("%d", &k);

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= k; j++) {
            printf("%d\t", i * j);
        }
        printf("\n");
    }
    return 0;
}
