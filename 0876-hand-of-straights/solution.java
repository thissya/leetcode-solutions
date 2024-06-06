class Solution {
    public boolean isNStraightHand(int[] hand, int w) {
        if(hand.length%w!=0)
        {
            return false;
        }
        TreeMap<Integer,Integer> count= new TreeMap();
        for(int card:hand)
        {
            if(!count.containsKey(card))
            {
                count.put(card,1);
            }
            else{
                count.replace(card,count.get(card)+1);
            }
        }
        
        while(count.size()>0)
        {
            int minval=count.firstKey();
            for(int i=minval;i<minval+w;i++)
            {
                if(!count.containsKey(i))
                {
                    return false;
                }
                int c =count.get(i);
                if(c==1)
                {
                    count.remove(i);
                }
                else{
                    count.replace(i,c-1);
                }
            }
        }
        return true;
    }
}
