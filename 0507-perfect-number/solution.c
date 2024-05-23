bool checkPerfectNumber(int num) {
    int i=1,sum=0,y=0;
    while(i<=num/2){
        if(num%i==0)
        {
            sum+=i;
        }
        i++;
    }
    return (sum==num)?true:false;
}
