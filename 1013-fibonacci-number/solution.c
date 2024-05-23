int fib(int n){
    int a=0;
    int b=1;
    if(n==1)
    {
        return 1;
    }
    int i=1;
    int c=0;
    while(i<n)
    {
        printf("%d ",a);
        c=a+b;
        a=b;
        b=c;
        i++;
    }
    return c;
}
