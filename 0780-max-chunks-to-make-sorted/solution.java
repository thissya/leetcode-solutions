class Solution {
    public int maxChunksToSorted(int[] arr) {
        int p=0;
        //using max index
        int maxval=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            maxval=Math.max(maxval,arr[i]);
            if(maxval==i){
                p++;
            }
        }
        return p;

        /*
        int sum = 0;
        int p = 0;
        int n = arr.length;
        int indexsum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            indexsum+=i;
            if(sum==indexsum){
                p++;
            }
        }
        return p;
        */
    }
}
