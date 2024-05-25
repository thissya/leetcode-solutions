char* removeStars(char* s) {
    int n=strlen(s);
    char *res=(char *)malloc((n+1)*sizeof(char));
    int ind=0;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='*')
        {
            if(ind>0)
            {
                ind--;
            }
        }
        else{
            res[ind]=s[i];
            ind++;
        }
    }
    res[ind]='\0';
    return res;
}
