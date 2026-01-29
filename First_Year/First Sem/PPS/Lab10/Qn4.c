/*4. To read a file and write into another file converting all characters to upper case. */
#include <stdio.h>

int main() {
    FILE *fp1, *fp2;
    char ch;

    fp1 = fopen("qn1.txt", "r");
    fp2 = fopen("output.txt", "w");

    if(fp1 == NULL || fp2 == NULL) {
        printf("File error\n");
        return 0;
    }

    while((ch = fgetc(fp1)) != EOF) {
        if(ch >= 'a' && ch <= 'z')
            ch = ch - 32;
        fputc(ch, fp2);
    }

    fclose(fp1);
    fclose(fp2);

    printf("Converted to uppercase successfully\n");
    return 0;
}
