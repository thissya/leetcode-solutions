class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> sm=new HashMap<>();
        sm.put('I',1);
        sm.put('V',5);
        sm.put('X',10);
        sm.put('L',50);
        sm.put('C',100);
        sm.put('D',500);
        sm.put('M',1000);

        int result=0;
        int prevalue=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int currentvalue=sm.get(s.charAt(i));
            if(currentvalue<prevalue)
            {
                result-=currentvalue;
            }
            else
            {
                result+=currentvalue;
            }
            prevalue=currentvalue;
        }
        return result;
    }
}
