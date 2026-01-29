/*3. To copy the contents of one file into another file.  */
#include <stdio.h>

int main() {
    FILE *fp1, *fp2;
    char ch;

    fp1 = fopen("qn1.txt", "r");
    fp2 = fopen("destination.txt", "w");

    if(fp1 == NULL || fp2 == NULL) {
        printf("File error\n");
        return 0;
    }

    while((ch = fgetc(fp1)) != EOF)
        fputc(ch, fp2);

    fclose(fp1);
    fclose(fp2);

    printf("File copied successfully\n");
    return 0;
}
