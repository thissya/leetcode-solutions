class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[2];
        int i=0;
        for(int n:map.keySet()){
            if(map.get(n)>=2){
                arr[i++]=n;
            }
        }
        return arr;
    }
}

/*
        int[] arr=new int[2];
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])arr[j++]=nums[i];
        }
        return arr;    
*/
