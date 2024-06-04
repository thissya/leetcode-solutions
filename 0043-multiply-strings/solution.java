class Solution {
    public String multiply(String num1, String num2) 
    {
        int n=num1.length();
        int m=num2.length();
        int[] res=new int[n+m];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                int mul=(num1.charAt(i)-'0') *(num2.charAt(j)-'0');
                int sum=mul+res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder s= new StringBuilder();
        for(int i:res)
        {
            if(!(s.length()==0 &&i==0))
            {
                s.append(i);
            }
        }
        return s.length()==0?"0":s.toString();
    }
}
