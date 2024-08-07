class Solution {
    String[] less_than_20 ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen"
    ,"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] tens={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String[] thousand={"","Thousand","Million","Billion"};
    public String numberToWords(int num) {
        if(num==0)return "Zero";
        int i=0;
        String word="";
        while(num>0)
        {
            if(num%1000!=0)
            {
                word=helper(num%1000)+thousand[i]+" "+word;
            }
            num/=1000;
            i++;
        }
        return word.trim();
    }

    public String helper(int num)
    {
        if(num==0)return "";
        else if (num<20)
        {
            return less_than_20[num]+" ";
        }
        else if(num<100)
        {
            return tens[num/10]+" "+helper(num%10);
        }
        else 
        {
            return less_than_20[num/100]+" Hundred "+helper(num%100);
        }
    }
}
