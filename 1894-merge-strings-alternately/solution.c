#include<stdlib.h>
char * mergeAlternately(char * word1, char * word2)
{
    int n=strlen(word1);
    int m=strlen(word2);
    char *arr=(char *)malloc((n+m+1)*sizeof(char));
    int i=0,j=0,ind=0;
    while(i<n||j<m)
    {
        if(i<n)
        {
            arr[ind++]=word1[i++];
        }
        if(j<m)
        {
            arr[ind++]=word2[j++];
        }
    }
    arr[ind]='\0';
    return arr;
}
