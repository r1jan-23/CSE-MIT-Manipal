/*2. Arrange the given elements in a 1D array in ascending and descending order using 
bubble sort method. [Hint: use switch case (as case ‘a’ and case ‘d’) to specify the 
order]. */
#include <stdio.h>

int main() {
    int n, i, j, temp;
    char ch;
    int arr[100];

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter 'a' for ascending or 'd' for descending: ");
    scanf(" %c", &ch);

    switch (ch) {
        case 'a':
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            break;

        case 'd':
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            break;

        default:
            printf("Invalid choice");
            return 0;
    }

    printf("Sorted array:\n");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}
