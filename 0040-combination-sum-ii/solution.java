class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(can);
        backtrack(0,new ArrayList<>(),target,can,res);
        return res;
    }
    public void backtrack(int start,List<Integer> cur,int target,int[] can,List<List<Integer>> res){
        if(target<0){
            return ;
        }
        if(target==0){
            if(!res.contains(cur)){
                res.add(new ArrayList<>(cur));
            }
            return ;
        }

        for(int i=start;i<can.length;i++){
            if(i>start && can[i]==can[i-1])continue;
            cur.add(can[i]);
            backtrack(i+1,cur,target-can[i],can,res);
            cur.remove(cur.size()-1);
        }

    }
}

/*

Time Limit Exceed
public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] flag = new boolean[can.length];
        Arrays.sort(can);
        backtrack(0,new ArrayList<>(),target,can,res,flag);
        return res;
    }
    public void backtrack(int start,List<Integer> cur,int target,int[] can,List<List<Integer>> res,boolean[] flag){
        if(target<0){
            return ;
        }
        if(target==0){
            if(!res.contains(cur)){
                res.add(new ArrayList<>(cur));
            }
            return ;
        }

        for(int i=start;i<can.length;i++){
            if(flag[i])continue;
            cur.add(can[i]);
            flag[i]=true;
            backtrack(i+1,cur,target-can[i],can,res,flag);
            flag[i]=false;
            cur.remove(cur.size()-1);
        }

    }
*/
