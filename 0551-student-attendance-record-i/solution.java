class Solution {
    public boolean checkRecord(String s) {
        if(s.indexOf("LLL")!=-1)
        {
            return false;
        }
        int a=0;
        for(char c:s.toCharArray())
        {
            if(c=='P')continue;
            if(c=='A')
            {
                a++;
                if(a>1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
