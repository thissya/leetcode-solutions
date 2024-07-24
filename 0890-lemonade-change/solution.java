class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10 && five>0)
            {
                ten++;
                five--;
            }
            else if(bills[i]==20)
            {
                if(ten>0)
                {
                    if(five>0)
                    {
                        ten--;
                        five--;
                    }
                    else{
                        return false;
                    }
                }
                else if(five>2)
                {
                    five-=3;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
