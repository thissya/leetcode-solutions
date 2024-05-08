class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        int n=score.length;
        int[] sortarr=Arrays.copyOf(score,n);
        Arrays.sort(sortarr);
        String[] result=new String[n];
        for(int i=0;i<n;i++)
        {
            int index=Arrays.binarySearch(sortarr,score[i]);
            int rank=n-index;
            if(rank==1)
            {
                result[i]="Gold Medal";
            }
            else if(rank==2)
            {
                result[i]="Silver Medal";
            }
            else if(rank==3)
            {
                result[i]="Bronze Medal";
            }
            else
            {
                result[i]=String.valueOf(rank);
            }
        }
        return result;
    }
}
