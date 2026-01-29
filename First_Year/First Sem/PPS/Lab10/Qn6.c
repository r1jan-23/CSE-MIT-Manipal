/*6. To print the last n characters of a file. Input ‘file name’ and ‘n’ value from console.*/
#include <stdio.h>

int main() {
    FILE *fp;
    char filename[20];
    int n, count = 0;
    char ch;

    printf("Enter file name: ");
    scanf("%s", filename);

    printf("Enter n value: ");
    scanf("%d", &n);

    fp = fopen(filename, "r");

    if(fp == NULL) {
        printf("File not found\n");
        return 0;
    }

    while((ch = fgetc(fp)) != EOF)
        count++;

    fseek(fp, count - n, SEEK_SET);

    printf("Last %d characters:\n", n);
    while((ch = fgetc(fp)) != EOF)
        putchar(ch);

    fclose(fp);
    return 0;
}
