class Solution {
    public int findComplement(int num) {
        String n=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='1')
            {
                ans+='0';
            }
            else {
                ans+='1';
            }
        }
        return Integer.parseInt(ans,2);
        
    }
}
