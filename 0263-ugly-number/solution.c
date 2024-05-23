bool isUgly(int n) {
    int x=n;
    if(n==1)
    {
        return true;
    }
    int sum=1,i=0;
    int arr[3]={2,3,5};
    while(sum<x && i<3)
    {
        if(n%arr[i]==0)
        {
            sum=sum*arr[i];
            n=n/arr[i];
        }
        else{
            i++;
        }
    }
    if(sum==x)
    {
        return true;
    }
    else{
        return false;
    }
    
}
