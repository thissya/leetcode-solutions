class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Integer[] num1=Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        Set<Integer> set1 = new HashSet<>(Arrays.asList(num1));
        Integer[] num2 =Arrays.stream(nums2).boxed().toArray(Integer[]::new);
        Set<Integer> set2=new HashSet<>(Arrays.asList(num2));
        set1.retainAll(set2);
        int a=0;
        int[] arr= new int[set1.size()];
        for(int i:set1)
        {
            arr[a++]=i;
        }
        return arr;
    }
}
