class Solution {
    public int addDigits(int num) {
        int sum=num;
        while(sum>9)
        {
            int temp=0;
            while(sum>0)
            {
                int rem=sum%10;
                temp+=rem;
                sum/=10;
            }
            sum=temp;
        }
        return sum;
    }
}
/*
if(num==0)return 0;
return num%9==0?9:num%9;
*/
