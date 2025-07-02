class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                ans.reverse();
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}

/*
public String reverse(String ans){
        int l=0;
        int r=ans.length()-1;
        char[] str = ans.toCharArray();
        while(l<r){
            char c = str[l];
            str[l]=str[r];
            str[r]=c;
            l++;
            r--;
        }
        return new String(str);
    }
    public String finalString(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                ans=reverse(ans);
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
*/
