/*.  Evaluate the sine series, sin(x)= x- x3 /3! + x5 /5!–x7 /7!+ ……… to n terms. */
#include <stdio.h>

int main() {
    int n, i, j;
    double x, term, sum = 0, fact;

    printf("Enter value of x (in radians): ");
    scanf("%lf", &x);
    printf("Enter number of terms: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        term = 1;
        fact = 1;

        for (j = 1; j <= (2 * i + 1); j++)
            fact *= j;

        term = pow(-1, i) * pow(x, (2 * i + 1)) / fact;
        sum += term;
    }

    printf("sin(x) = %lf", sum);
    return 0;
}
