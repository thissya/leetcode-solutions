class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        Set<Integer> arr=new HashSet<>();
        List<Integer> arr1=new ArrayList<>();
        for(int i:nums)
        {
            if(!arr.add(i))
            {
                arr1.add(i);
            }
        }
        return arr1;
    }
}
