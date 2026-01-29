/*2. Compute and display the trace and norm of a given square matrix. 
[Hint: Trace= sum of principal diagonal elements, Norm= SQRT (sum of squares of 
the individual elements of an array)] */
#include <stdio.h>
#include <math.h>

int main() {
    int a[10][10], i, j, n;
    int trace = 0;
    float norm = 0;

    printf("Enter order of square matrix: ");
    scanf("%d", &n);

    printf("Enter matrix elements:\n");
    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            scanf("%d", &a[i][j]);
            norm += a[i][j] * a[i][j];
            if(i == j)
                trace += a[i][j];
        }
    }

    norm = sqrt(norm);

    printf("Trace = %d\n", trace);
    printf("Norm = %.2f\n", norm);

    return 0;
}
