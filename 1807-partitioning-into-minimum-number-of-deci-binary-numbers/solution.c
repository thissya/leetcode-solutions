int minPartitions(char* n) {
    int i=0,max=0;
    while(n[i]!='\0')
    {
        int val=n[i]-'0';
        if(val>max)
        {
            max=val;
        }
        i++;
    }
    return max;
}
