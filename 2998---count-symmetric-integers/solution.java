class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String temp = String.valueOf(i);
            if(temp.length()%2!=0){
                continue;
            }
            int val1=0;
            int val2=0;
            int n=temp.length();
            for(int j=0;j<(n/2);j++){
                val1+=temp.charAt(j)-'0';
                val2+=temp.charAt((n/2)+j)-'0';
            }
            if(val1==val2){
                c++;
            }
        }
        return c;
    }
}
