class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }

}

/*
# Partially passes testcase

class Solution {
    
    public boolean recur(int n,int pow){
        if(n==0){
            return true;
        }
        if(n<0){
            return false;
        }
        int cap1 =(int)Math.pow(3,pow+1);
        int cap2 =(int)Math.pow(3,pow+2);
        System.out.println(n);
        return recur(n-cap1,pow+1) || recur(n-cap2,pow+2);
    }

    public boolean checkPowersOfThree(int n) {
        return recur(n,-1);
    }

}
*/
