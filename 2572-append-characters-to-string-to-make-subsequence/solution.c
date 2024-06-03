int appendCharacters(char* s, char* t) {
    int i=0,j=0;
    int n=strlen(t);
    while(s[i]!='\0')
    {
        if(s[i]==t[j])
        {
            j++;
        }
        i++;
    }
    return n-j; 
}
