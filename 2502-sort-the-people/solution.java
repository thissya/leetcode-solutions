class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    {
        //Using HashMap
        HashMap<Integer,String> hm= new HashMap<>();
        int n=heights.length;
        for(int i=0;i<n;i++)
        {
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        String[] arr=new String[n];
        for(int i=n-1;i>=0;i--)
        {
            arr[j++]=hm.get(heights[i]);
        }
        return arr;
    }
}
/*
        //O(n^2)
        for(int i=0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(heights[i]<heights[j])
                {
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    String stemp=names[i];
                    names[i]=names[j];
                    names[j]=stemp;
                }
            }
        }
        return names;
        */
