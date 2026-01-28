/*8. Write a C program to evaluate the following expression for the values a = 30, 
b=10, c=5, d=15 
(i )   (a + b) * c / d    
(iii)   a + (b * c) / d   
(ii)  ((a + b) * c) / d   
 (iv)
    (a + b) * (c / d) */
    #include <stdio.h>

int main() {
    int a = 30, b = 10, c = 5, d = 15;
    printf("%d\n", (a + b) * c / d);
    printf("%d\n", ((a + b) * c) / d);
    printf("%d\n", a + (b * c) / d);
    printf("%d\n", (a + b) * (c / d));
    return 0;
}
