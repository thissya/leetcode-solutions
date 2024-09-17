class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr= new int[2];
        int[] count= new int[100];
        int j=0;
        for(int i:nums)
        {
            count[i]++;
            if(count[i]==2)
            {
                arr[j++]=i;
            }
        }
        return arr;
    }
}
