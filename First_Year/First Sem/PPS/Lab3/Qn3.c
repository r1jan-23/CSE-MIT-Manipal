/*3. Check if the sum of the cubes of all digits of an inputted number equals the number 
itself (Armstrong Number). (use while loop) */
#include <stdio.h>

int main() {
    int n, temp, digit, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;
    while (temp > 0) {
        digit = temp % 10;
        sum = sum + (digit * digit * digit);
        temp = temp / 10;
    }

    if (sum == n)
        printf("Armstrong Number");
    else
        printf("Not Armstrong Number");

    return 0;
}
