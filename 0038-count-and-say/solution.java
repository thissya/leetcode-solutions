class Solution {
    public String countAndSay(int n) {
        int i=1;
        String sum="1";
        while(i<n){
            i++;
            String temp = sum;
            int c = 1;
            List<int[]> list = new ArrayList<>();
            char prev = temp.charAt(0);
            for(int j=1;j<temp.length();j++){
                if(prev == temp.charAt(j) ){
                    c++;
                }else{
                    list.add(new int[]{c,prev-'0'});
                    prev=temp.charAt(j);
                    c=1;
                } 
            }
            list.add(new int[]{c,prev-'0'});
            String total = "";
            for(int[] a:list){
                String cur = a[0]+""+a[1];
                total+=cur;
            }
            sum=total;
        }
        return sum;
    }
}
