class Solution {
    static List<String> res;
    public List<String> stringSequence(String target) {
        res =  new ArrayList<>();
        recur(0,"a",target);
        return res;
    }
    public static char getNextChar(char c){
        if(c>='a' && c<='y'){
            return (char)(c+1);
        }else if(c=='z'){
            return 'a';
        }else if(c>='A' && c<='Y'){
            return (char)(c+1);
        }else if(c=='Z'){
            return 'A';
        }
        return '.';
    }
    public static void recur(int i,String cur,String target){
        res.add(cur);
        if(cur.charAt(i)==target.charAt(i)){
            if(cur.equals(target)){
                return ;
            }else{
                // res.add(cur);
                cur+="a";
                recur(i+1,cur,target);
            }
            return ;
        }
        else{
            // res.add(cur);
            char nextchar=getNextChar(cur.charAt(cur.length()-1));
            char[] arr = cur.toCharArray();
            arr[arr.length-1]=nextchar;
            String str = new String(arr);
            recur(i,str,target);
        }
    }
}
