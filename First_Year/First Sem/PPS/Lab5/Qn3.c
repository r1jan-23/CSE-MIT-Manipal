/*3.  Print all the prime numbers in a given 1D array. */
#include <stdio.h>

int main() {
    int n, i, j, count;
    int arr[100];

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Prime numbers in the array:\n");

    for (i = 0; i < n; i++) {
        if (arr[i] > 1) {
            count = 0;
            for (j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    count++;
            }
            if (count == 2)
                printf("%d ", arr[i]);
        }
    }

    return 0;
}
