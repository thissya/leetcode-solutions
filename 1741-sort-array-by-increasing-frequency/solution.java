class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());
        list.sort((a,b)->{
            int freq=a.getValue().compareTo(b.getValue());
            if(freq==0)
            {
                return b.getKey().compareTo(a.getKey());
            }
            else{
                return freq;
            }
        });
        
        int ind=0;
        for(Map.Entry<Integer,Integer> c:list)
        {
            for(int i=0;i<c.getValue();i++)
            {
                nums[ind++]=c.getKey();
            }
        }
        return nums;
    }
}
