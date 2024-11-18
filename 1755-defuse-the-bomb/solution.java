class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res = new int[n];
        int[] arr= new int[n*2];
        if(k==0)return res;
        for(int i=0;i<n;i++){
            arr[i]=code[i];
            arr[i+n]=code[i];
        }    
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i+1;j<=i+k;j++){
                    sum+=arr[j];
                }
                res[i]=sum;
            }
        }else{
            int ind=0;
            for(int i=n;i<n*2;i++){
                int sum=0;
                for(int j=i-1;j>=i+k;j--){
                    sum+=arr[j];
                }
                res[ind++]=sum;
            }
        }
        return res;
    }
}
