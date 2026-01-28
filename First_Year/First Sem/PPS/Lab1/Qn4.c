/*4. Write a C program to display the size of the data type int, char, float, double, long 
int and long double using sizeof( ) operator.  */
#include <stdio.h>

int main() {
    printf("%zu\n", sizeof(int));
    printf("%zu\n", sizeof(char));
    printf("%zu\n", sizeof(float));
    printf("%zu\n", sizeof(double));
    printf("%zu\n", sizeof(long int));
    printf("%zu\n", sizeof(long double));
    return 0;
}
