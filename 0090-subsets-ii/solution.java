class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,new ArrayList<>(),res,nums);
        return res;
    }
    public static void backtrack(int i,List<Integer> cur ,List<List<Integer>> res, int[] nums){
        if(i==nums.length){
            if(!res.contains(cur)){
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        
        List<Integer> newarr= new ArrayList<>(cur);
        cur.add(nums[i]);
        backtrack(i+1,newarr,res,nums);
        backtrack(i+1,cur,res,nums);
        
        
        // cur.add(nums[i]);
        // backtrack(i+1,cur,res,nums);
        // cur.remove(cur.size()-1);
        // backtrack(i+1,cur,res,nums);

    }
}


/*
public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,new ArrayList<>(),res,nums);
        return res;
    }
    public static void backtrack(int ind,List<Integer> cur ,List<List<Integer>> res, int[] nums){
        if(!res.contains(cur)){
            res.add(new ArrayList<>(cur));
        }
        for(int i=ind;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(i+1,cur,res,nums);
            cur.remove(cur.size()-1);
        }
    }
*/

