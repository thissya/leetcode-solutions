class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] ans=new int[arr1.length];
        int[] count=new int[1001];
        for(int i:arr1)
        {
            count[i]++;
        }
        int n=0;
        for(int i:arr2)
        {
            while(count[i]>0)
            {
                ans[n++]=i;
                count[i]--;
            }
        }
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                ans[n++]=i;
                count[i]--;
            }
        }
        return ans;
    }
}
