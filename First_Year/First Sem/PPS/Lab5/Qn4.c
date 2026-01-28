/*4. Search the position of the number that is entered by the user and delete that particular 
number from the array and display the resultant array elements. */

#include <stdio.h>

int main() {
    int n, i, pos = -1, key;
    int arr[100];

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter element to delete: ");
    scanf("%d", &key);

    for (i = 0; i < n; i++) {
        if (arr[i] == key) {
            pos = i;
            break;
        }
    }

    if (pos == -1) {
        printf("Element not found");
    } else {
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        n--;

        printf("Array after deletion:\n");
        for (i = 0; i < n; i++)
            printf("%d ", arr[i]);
    }

    return 0;
}
