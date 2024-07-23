class Solution 
{
    public List<Integer> grayCode(int n) 
    {
        List<Integer> li= new ArrayList<>();
        int len=1<<n;
        for(int i=0;i<len;i++)
        {
            li.add(i^(i>>1));
        }        
        return li;
    }
}
