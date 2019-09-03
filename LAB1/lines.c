#include<stdio.h>
int main()
{
    FILE *fileptr;
    int count=0;
    char filechar[40],chr;
    printf("enter the file name\n");
    scanf("%s",filechar);
    fileptr=fopen(filechar,"r");
    chr=getc(fileptr);
    while(!feof(fileptr))
    {
        if(chr=='\n')
        {
            count++;
            
        }
        chr=getc(fileptr);
    }
    fclose(fileptr);
    printf("number of files in a string:%d\n",count);
}
