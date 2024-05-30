int numSteps(char* s) {
    int c=0,sum=0;
    int n=strlen(s);
    for(int i=n-1;i>0;i--)
    {
        int d=s[i]-'0';
        if(d+c==1)
        {
            c=1;
            sum+=2;
        }
        else{
            sum+=1;
        }

    }
    if(c==1)
    {
        sum+=1;
    }
    return sum;
}
