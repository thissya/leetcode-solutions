int countSegments(char* s) {
    int c=0;
    int i=0,firstletter=0;
    while(s[i]!='\0')
    {
        if(s[i]!=' ')
        {
            if(firstletter==0)
            {
                c++;
                firstletter=1;
            }
        }
        else{
            firstletter=0;
        }
        i++;
    }
    return c;
    
}
