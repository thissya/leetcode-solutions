class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> hm= new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }       
       int res=0;          
       for(int num:hm.keySet()){
        if(hm.get(num) == 1){
            res = num;
        }
       }
       return res;
    }
}
