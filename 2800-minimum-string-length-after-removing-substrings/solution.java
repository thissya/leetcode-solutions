class Solution {
    public int minLength(String s) {
        while(true)
        {
            String temp=remove(s);
            if(temp==s)break;
            s=temp;
        }
        return s.length();
    }
    public String remove(String str)
    {
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)=='A' && str.charAt(i)=='B')
            {
                str = str.replace("AB","");
            }
            else if(str.charAt(i-1)=='C' && str.charAt(i)=='D')
            {
                str =  str.replace("CD","");
            }
        }
        return str;
    }
}
