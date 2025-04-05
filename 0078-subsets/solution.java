class Solution {
    // construct and view tree how it works
    List<List<Integer>> res = new ArrayList<>();
    public void dfs(int[] nums,int i,int n,List<Integer> arr){
        if(i>=n){
            res.add(arr);
            return;
        }
        List<Integer> newarr = new ArrayList<>(arr);
        newarr.add(nums[i]);
        dfs(nums,i+1,n,newarr);
        dfs(nums,i+1,n,arr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        dfs(nums,0,n,arr);
        return res;
    }

}
/*
    public List<List<Integer>> subsets(int[] nums) {
        // bitwise method 
        //  001 -1
        //  010 -2  011-[2,3]
        //  100 -3
        //  101 -[1,3] 110 -[1,2]    
        
        int n = nums.length;
        int pow = 1<<n;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<pow;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j)) !=0){
                    temp.add(nums[j]);
                }
                cur=cur>>1;
            }
            res.add(temp);
        }
        return res;
    }

*/
