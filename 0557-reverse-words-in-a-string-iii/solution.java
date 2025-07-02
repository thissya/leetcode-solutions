class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String res = "";
        for(String str:strs){
            StringBuilder temp = new StringBuilder(str);
            String srs = temp.reverse().toString();
            res+=srs;
            res+=" ";
        }
        StringBuilder temp = new StringBuilder(res);
        temp.deleteCharAt(temp.length()-1);
        return temp.toString();
    }
}
