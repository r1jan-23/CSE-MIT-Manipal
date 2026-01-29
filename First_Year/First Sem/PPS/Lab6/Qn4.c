/*4. Interchange any two Rows & Columns in the given matrix and display resultant. */
#include <stdio.h>

int main() {
    int a[10][10], i, j, r, c, r1, r2, c1, c2, temp;

    printf("Enter rows and columns: ");
    scanf("%d %d", &r, &c);

    printf("Enter matrix elements:\n");
    for(i = 0; i < r; i++)
        for(j = 0; j < c; j++)
            scanf("%d", &a[i][j]);

    printf("Enter two rows to interchange: ");
    scanf("%d %d", &r1, &r2);

    for(j = 0; j < c; j++) {
        temp = a[r1][j];
        a[r1][j] = a[r2][j];
        a[r2][j] = temp;
    }

    printf("Enter two columns to interchange: ");
    scanf("%d %d", &c1, &c2);

    for(i = 0; i < r; i++) {
        temp = a[i][c1];
        a[i][c1] = a[i][c2];
        a[i][c2] = temp;
    }

    printf("Resultant Matrix:\n");
    for(i = 0; i < r; i++) {
        for(j = 0; j < c; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }

    return 0;
}
