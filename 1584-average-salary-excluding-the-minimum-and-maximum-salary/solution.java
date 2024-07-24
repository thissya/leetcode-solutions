class Solution 
{
    public double average(int[] salary) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        for(int i:salary)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
            sum+=i;
        }     
        return (sum-min-max)/(salary.length-2);
    }
}
/*
Arrays.sort(salary);
        int n=salary.length-2;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=salary[i];
        }
        return (double)sum/n;
*/
