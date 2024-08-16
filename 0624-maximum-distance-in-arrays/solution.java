class Solution {
    public int maxDistance(List<List<Integer>> arrays) 
    {
        int ans=0;
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        for(int i=1;i<arrays.size();i++)
        {
            List<Integer> aset= new ArrayList<>(arrays.get(i));
            int curmin=aset.get(0);
            int curmax=aset.get(aset.size()-1);

            ans=Math.max(ans,Math.abs(max-curmin));
            ans=Math.max(ans,Math.abs(curmax-min));

            min=Math.min(min,curmin);
            max=Math.max(max,curmax);
        }    
        return ans;
    }
}
