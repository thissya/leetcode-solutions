class Solution {
    public int maxChunksToSorted(int[] arr) {
        int c=0,max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(i==max)c++;
        }  
        return c;
    }
}
