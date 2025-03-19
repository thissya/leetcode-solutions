class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> res = new ArrayList<>();
        int  min =Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<n-1;i++){
            if((arr[i+1]-arr[i])==min)
            {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                res.add(temp);
            }
        }
        return res;
    }
}
