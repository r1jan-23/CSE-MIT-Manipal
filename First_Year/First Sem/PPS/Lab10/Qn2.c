/*2. To write a line of text into an existing file.  */
#include <stdio.h>

int main() {
    FILE *fp;
    char text[100];

    fp = fopen("qn1.txt", "a");  

    if(fp == NULL) {
        printf("File not found\n");
        return 0;
    }

    printf("Enter a line of text:\n");
    gets(text);

    fprintf(fp, "%s\n", text);

    fclose(fp);
    printf("Text written successfully\n");
    return 0;
}

