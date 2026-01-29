/* 1. Write a function Fact to find the factorial of a given number. Using this function, 
compute NCR in the main function. */
#include <stdio.h>

int Fact(int n) {
    int i, f = 1;
    for(i = 1; i <= n; i++)
        f = f * i;
    return f;
}

int main() {
    int n, r, ncr;

    printf("Enter n and r: ");
    scanf("%d %d", &n, &r);

    ncr = Fact(n) / (Fact(r) * Fact(n - r));

    printf("NCR = %d\n", ncr);
    return 0;
}
