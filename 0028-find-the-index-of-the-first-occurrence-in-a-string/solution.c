int strStr(char* haystack, char* needle) 
{
    int j=0;
    int n=strlen(haystack);
    for(int i=0;i<n;i++)
    {
        j=0;
        while(haystack[i+j]==needle[j])
        {
            j++;
            if(j==strlen(needle))
            {
                return i;
            }
        }
    }
    return -1;
}
