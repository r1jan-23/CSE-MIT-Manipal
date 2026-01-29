/*4. Delete a word from the given sentence. 
Ex: INPUT: I AM STUDYING IN MIT  
TO BE DELETED: STUDYING       
OUTPUT: I AM IN MIT */
#include <stdio.h>

int main() {
    char str[200], word[50], result[200];
    int i = 0, j = 0, k, match;

    printf("Enter the sentence:\n");
    gets(str);

    printf("Enter word to be deleted:\n");
    gets(word);

    while(str[i] != '\0') {
        match = 1;

        for(k = 0; word[k] != '\0'; k++) {
            if(str[i + k] != word[k]) {
                match = 0;
                break;
            }
        }

        if(match && (str[i + k] == ' ' || str[i + k] == '\0')) {
            i = i + k + 1;   // skip the word
        } else {
            result[j++] = str[i++];
        }
    }

    result[j] = '\0';

    printf("Output: %s\n", result);
    return 0;
}
