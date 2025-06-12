class Solution {
    public int maxAdjacentDistance(int[] arr) {
        int max=0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            int sum = Math.abs(arr[i]-arr[(i+1)%n]);
            max=Math.max(max,sum);
        }
        return max;
    }
}
