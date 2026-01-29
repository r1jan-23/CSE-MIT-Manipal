/*With the brief introduction and knowledge on strings, write C programs without using 
STRING-HANDLING functions for the following: 
1. Count the number of words in a sentence. */

#include <stdio.h>

int main() {
    char str[200];
    int i, count = 0;

    printf("Enter a sentence:\n");
    gets(str);

    for(i = 0; str[i] != '\0'; i++) {
        if((i == 0 && str[i] != ' ') ||
           (str[i] == ' ' && str[i + 1] != ' ' && str[i + 1] != '\0')) {
            count++;
        }
    }

    printf("Number of words = %d\n", count);
    return 0;
}
