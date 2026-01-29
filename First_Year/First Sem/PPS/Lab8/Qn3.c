/* 3. Write a recursive function, GCD to find the GCD of two numbers. Write a main pro
gram which reads 2 numbers and finds the GCD of the numbers using the specified 
function. Ex: GCD of 9, 24 is 3.*/
#include <stdio.h>

int GCD(int a, int b) {
    if(b == 0)
        return a;
    return GCD(b, a % b);
}

int main() {
    int x, y;

    printf("Enter two numbers: ");
    scanf("%d %d", &x, &y);

    printf("GCD = %d\n", GCD(x, y));
    return 0;
}
