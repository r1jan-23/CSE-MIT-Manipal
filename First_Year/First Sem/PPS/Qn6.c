/*6. Write a C program to input radius, compute and display the volume and surface 
area of a sphere. [Hint: volume = (4πr3)/3, Area=4πr2] */
#include <stdio.h>

int main() {
    double r, volume, area;
    printf("Enter Radius");
    scanf("%lf", &r);
    volume = (4.0 * 3.141592653589793 * r * r * r) / 3.0;
    area = 4.0 * 3.141592653589793 * r * r;
    printf("%lf\n", volume);
    printf("%lf\n", area);
    return 0;
}
