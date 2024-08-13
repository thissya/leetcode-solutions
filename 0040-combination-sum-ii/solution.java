class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        backtrack(ans,new ArrayList<>(),candidates,target,0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> temp,int[] can,int remain,int start)
    {
        if(remain==0)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        else if(remain<0)return ;
        else
        {
            for(int i=start;i<can.length;i++)
            {
                if(i>start && can[i]==can[i-1])continue;
                if(remain>=can[i])
                {
                    temp.add(can[i]);
                    backtrack(ans,temp,can,remain-can[i],i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
}
