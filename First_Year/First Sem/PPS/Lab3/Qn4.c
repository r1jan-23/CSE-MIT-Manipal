/*4. Write a program using do-while loop to read the numbers until -1 is encountered. Also 
count the number of prime numbers and composite numbers entered by user.  
[Hint: 1 is neither prime nor composite] */
#include <stdio.h>

int main() {
    int n, i, count, prime = 0, composite = 0;

    do {
        printf("Enter a number (-1 to stop): ");
        scanf("%d", &n);

        if (n > 1) {
            count = 0;
            i = 1;
            while (i <= n) {
                if (n % i == 0)
                    count++;
                i++;
            }
            if (count == 2)
                prime++;
            else
                composite++;
        }
    } while (n != -1);

    printf("Prime count = %d\n", prime);
    printf("Composite count = %d", composite);

    return 0;
}
