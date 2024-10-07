class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int c=0,ans=0;
        while(n1>=0 || n2>=0 || c>0)
        {
            int n=(n1>=0)?num1.charAt(n1)-'0':0;
            int m=(n2>=0)?num2.charAt(n2)-'0':0;
            int sum=n+m+c;
            ans=sum%10;
            c=sum/10;
            res.append(ans);
            n1--;
            n2--;
        }
        return res.reverse().toString();
    }
}
