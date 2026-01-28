/*4.  Check whether a given number is perfect or not.  
[Hint: Sum of all positive divisors of a given number excluding the given number is 
equal to the number] Ex: 28 = 1+ 2 + 4 + 7 + 14 = 28 is a perfect number*/

#include <stdio.h>

int main() {
    int n, i, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    for (i = 1; i <= n / 2; i++) {
        if (n % i == 0)
            sum += i;
    }

    if (sum == n)
        printf("Perfect Number");
    else
        printf("Not a Perfect Number");

    return 0;
}
