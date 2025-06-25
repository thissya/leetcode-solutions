class Solution {
    int ans = 0;
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        boolean[] visit = new boolean[nums.length];
        bt(nums,new ArrayList<>(),visit);
        return ans;
    }

    public void bt(int[] nums,List<Integer> cur,boolean[] visit){
        if(cur.size()==nums.length){
            ans++;
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visit[i])continue;
            
            if(i>0 && nums[i]==nums[i-1] && !visit[i-1])continue;

            if(!cur.isEmpty()){
                int prev = cur.get(cur.size()-1);
                int sum = prev+nums[i];
                int sqrt = (int)Math.sqrt(sum);
                if((sqrt*sqrt)!=sum)continue;
            }

            cur.add(nums[i]);
            visit[i]=true;
            bt(nums,cur,visit);
            visit[i]=false;
            cur.remove(cur.size()-1);
        }
    }
}
