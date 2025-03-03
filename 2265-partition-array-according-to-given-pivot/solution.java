class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        for(int i:nums){
            if(i>pivot){
                less.add(i);
            }else if(i==pivot){
                e.add(i);
            }
            else{
                more.add(i);
            }
        }
        int ind=0;
        for(int i:more){
            nums[ind++]=i;
        }
        for(int i:e){
            nums[ind++]=i;
        }
        for(int i:less){
            nums[ind++]=i;
        }
        return nums;
    }
}
