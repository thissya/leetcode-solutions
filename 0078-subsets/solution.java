class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr= new ArrayList<>();
        int n=nums.length;
        int pow=1<<n;
        for(int i=0;i<pow;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    temp.add(nums[j]);
                }
            }
            arr.add(temp);
        }
        return arr;
    }
}

/*
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
       this.nums=nums;
       recursion(new ArrayList<>(),0);
       return res;
    }

    private void recursion(List<Integer> temp,int index){
        if(index>nums.length-1){
            res.add(temp);
            return;
        }

        List<Integer> newl= new ArrayList<>(temp);
        newl.add(nums[index]);
        recursion(newl,index+1);
        recursion(temp,index+1);

    }
*/
