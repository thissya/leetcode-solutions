class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        boolean[] visited = new boolean[n];
        bt(nums,new ArrayList<>(),visited);
        return res;
    }

    public void bt(int[] nums,List<Integer> cur, boolean[] visited){
        if(cur.size()==nums.length){
            // if(!res.contains(cur))
            res.add(new ArrayList<>(cur));
            return ;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;   
            }
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1])continue;
            cur.add(nums[i]);
            visited[i]=true;
            bt(nums,cur,visited);
            visited[i]=false;
            cur.remove(cur.size()-1);

        }

    }

}
