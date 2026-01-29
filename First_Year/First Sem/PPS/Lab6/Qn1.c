/*1. Display whether a given matrix is symmetric or not. [Hint: A = AT] */
#include <stdio.h>

int main() {
    int a[10][10], i, j, n, flag = 1;

    printf("Enter order of square matrix: ");
    scanf("%d", &n);

    printf("Enter matrix elements:\n");
    for(i = 0; i < n; i++)
        for(j = 0; j < n; j++)
            scanf("%d", &a[i][j]);

    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            if(a[i][j] != a[j][i]) {
                flag = 0;
                break;
            }
        }
    }

    if(flag)
        printf("Matrix is Symmetric\n");
    else
        printf("Matrix is NOT Symmetric\n");

    return 0;
}
