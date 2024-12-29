class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        List<Integer> arr= new ArrayList<>(map.keySet());
        Collections.sort(arr);
        int maxval=-1;
        int maxkey=-1;
        for(int key:arr){
            int val=map.get(key);
            if(maxval<val){
                maxval=val;
                maxkey=key;
            }
        }
        return maxkey;
    }
}
