class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] arr1 =  new int[n];
        System.arraycopy(arr,0,arr1,0,n);
        int sum1=0;
        int sum2=0;
        int p=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum1+=arr[i];
            sum2+=arr1[i];
            if(sum1==sum2){
                p++;
            }
        }
        return p;
    }
}
