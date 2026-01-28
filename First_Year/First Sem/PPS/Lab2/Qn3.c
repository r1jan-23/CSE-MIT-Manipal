/*3. Compute all the roots of a quadratic equation using switch case statement. 
[Hint:  x = (-b  +/- sqrt(b2-4ac))/2a] */
#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c, d, r1, r2;
    printf("Enter a b c: ");
    scanf("%lf %lf %lf", &a, &b, &c);

    d = b*b - 4*a*c;

    switch (d > 0) {
        case 1:
            r1 = (-b + sqrt(d)) / (2*a);
            r2 = (-b - sqrt(d)) / (2*a);
            printf("%lf %lf", r1, r2);
            break;
        case 0:
            switch (d == 0) {
                case 1:
                    r1 = -b / (2*a);
                    printf("%lf", r1);
                    break;
                case 0:
                    printf("Imaginary roots");
            }
    }
    return 0;
}
