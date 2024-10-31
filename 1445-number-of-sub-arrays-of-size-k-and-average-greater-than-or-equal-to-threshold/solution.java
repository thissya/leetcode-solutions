class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }    
        int  avg=sum/k;
        if(avg>=threshold)c++;
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            avg=sum/k;
            if(avg>=threshold)c++;
        }
        return c;
    }
}
