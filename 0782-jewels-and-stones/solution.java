class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        /*
        Set<Character> res= new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            res.add(c);
        }
        int sum=0;
        for(char c:stones.toCharArray())
        {
            if(res.contains(c))
            {
                sum++;
            }
        }
        return sum;
        */
         
        int sum=0;
        for(char c:jewels.toCharArray())
        {
            for(int j=0;j<stones.length();j++)
            {
                if(c==stones.charAt(j))
                {
                    sum++;
                }
            }
        }
        return sum;
       
    }
}
