/*1. Reverse a given number and check if it is a palindrome or not. (use while loop). 
[Ex:  1234, reverse=4*10 3 +3 * 10 2 + 2 * 10 1 + 1 * 10 0 =4321] */
#include <stdio.h>

int main() {
    int n, temp, rev = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;
    while (temp > 0) {
        rev = rev * 10 + (temp % 10);
        temp = temp / 10;
    }

    printf("Reverse = %d\n", rev);

    if (rev == n)
        printf("Palindrome");
    else
        printf("Not Palindrome");

    return 0;
}
