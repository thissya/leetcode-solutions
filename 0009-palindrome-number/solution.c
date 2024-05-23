bool isPalindrome(int x) {
    int y=x;
    long int sum=0;
    if(x<0)
    {
        return false;
    }
    while(x!=0)
    {
        int rem=x%10;
        sum=sum*10+rem;
        x=x/10;
    }
    if(sum==y)
    {
        return true;
    }
    else{
        return false;
    }
    
}
