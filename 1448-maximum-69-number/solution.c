int maximum69Number (int num) {
    int temp=num;
    int s=0;
    int n=0;
    int sum=0;
    while(temp>0){
        int rem=temp%10;
        temp/=10;
        sum=sum*10+rem;
        n++;
    }
    temp=sum;
    sum=0;
    int f=0;
    while(temp>0){
        int rem=temp%10;
        if(rem==6 && f==0){
            sum=sum*10+9;
            f=1;
        }
        else{
            sum=sum*10+rem;
        }
        temp=temp/10;
    }
    return sum;
    
    
}
