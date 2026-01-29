/*3. Check whether the given string is a palindrome or not. */
#include <stdio.h>

int main() {
    char str[100];
    int i, j, flag = 1;

    printf("Enter a string:\n");
    gets(str);

    for(j = 0; str[j] != '\0'; j++);

    for(i = 0, j = j - 1; i < j; i++, j--) {
        if(str[i] != str[j]) {
            flag = 0;
            break;
        }
    }

    if(flag)
        printf("String is Palindrome\n");
    else
        printf("String is NOT Palindrome\n");

    return 0;
}
