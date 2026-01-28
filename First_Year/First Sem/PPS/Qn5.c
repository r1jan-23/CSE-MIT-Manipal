/*5. Write a C program to input P, N and R, compute and display simple and compound 
interest.  [Hint: SI = PNR/100, CI = P(1+R/100)N-P]  */
#include <stdio.h>
#include <math.h>

int main() {
    double P, N, R, SI, CI;
    printf("Enter P, N and R");
    scanf("%lf %lf %lf", &P, &N, &R);
    SI = (P * N * R) / 100;
    CI = P * pow(1 + R / 100, N) - P;
    printf("%lf\n", SI);
    printf("%lf\n", CI);
    return 0;
}
