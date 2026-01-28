/*7. Write a C program to convert the given temperature in Fahrenheit to Centigrade. 
[Hint: C=5/9(F-32)]  */
#include <stdio.h>

int main() {
    double F, C;
    printf("Enter Temp : ");
    scanf("%lf", &F);
    C = (5.0 / 9.0) * (F - 32);
    printf("%lf", C);
    return 0;
}
