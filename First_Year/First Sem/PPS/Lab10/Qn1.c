/*1. To open and read a sentence from a file and display the same on the console. */
#include <stdio.h>

int main() {
    FILE *fp;
    char ch;

    fp = fopen("qn1.txt", "r");

    if(fp == NULL) {
        printf("File not found\n");
        return 0;
    }

    printf("File contents:\n");
    while((ch = fgetc(fp)) != EOF)
        putchar(ch);

    fclose(fp);
    return 0;
}
