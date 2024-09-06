class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int a=columnTitle.charAt(i)-'A'+1;
            sum=sum*26+a;
        }
        return sum;
    }
}
