/*2. Generate prime numbers between 2 given limits. (use while loop) */
#include <stdio.h>

int main() {
    int low, high, i, n, count;
    printf("Enter lower and upper limit: ");
    scanf("%d %d", &low, &high);

    n = low;
    while (n <= high) {
        if (n > 1) {
            count = 0;
            i = 1;
            while (i <= n) {
                if (n % i == 0)
                    count++;
                i++;
            }
            if (count == 2)
                printf("%d ", n);
        }
        n++;
    }
    return 0;
}
