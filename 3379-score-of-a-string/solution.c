int scoreOfString(char* s) {
    int sum=0;
    int n=strlen(s);
    for(int i=0;i<n-1;i++)
    {
        sum+=abs(s[i]-s[i+1]);
    }
    return sum;
}
