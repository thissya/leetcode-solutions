class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        int n = nums.length;
        int l = n/3;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(ent.getValue()>l){
                arr.add(ent.getKey());
            }
        }

        return arr;
    }
}
