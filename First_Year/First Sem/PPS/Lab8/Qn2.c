/* 2. Write a function CornerSum which takes as a parameter, no. of rows and no. of col
umns of a matrix and returns the sum of the elements in the four corners of the matrix. 
Write a main function to test the function. */
#include <stdio.h>

int CornerSum(int a[10][10], int r, int c) {
    int sum;
    sum = a[0][0] + a[0][c - 1] + a[r - 1][0] + a[r - 1][c - 1];
    return sum;
}

int main() {
    int a[10][10], r, c, i, j;

    printf("Enter rows and columns: ");
    scanf("%d %d", &r, &c);

    printf("Enter matrix elements:\n");
    for(i = 0; i < r; i++)
        for(j = 0; j < c; j++)
            scanf("%d", &a[i][j]);

    printf("Corner Sum = %d\n", CornerSum(a, r, c));

    return 0;
}
