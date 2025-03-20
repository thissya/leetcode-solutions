class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        for(int i=2;i<n;i++){
            if((long)i*i >n){
                continue;
            }
            for(int j=i*i;j<n;j+=i){
                prime[j]=true;
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(prime[i]==false){
                c++;
            }
        }
        return c;
    }
}
