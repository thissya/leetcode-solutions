class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        while(true){
            int temp=n;
            int pro=1;
            while(temp>0){
                pro*=(temp%10);
                temp/=10;
            }
            if(pro%t==0){
                ans=n;
                break;
            }
            n++;
        }  
        return ans;
    }
}
