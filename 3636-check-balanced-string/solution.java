class Solution {
    public boolean isBalanced(String num) {
        int o=0;
        int e=0;
        for(int i=0;i<num.length();i++){
            int temp=num.charAt(i)-'0';
            if(i%2==0){
                o+=temp;
            }else{
                e+=temp;
            }
        }
        if(o==e)return true;
        return false;
    }
}
