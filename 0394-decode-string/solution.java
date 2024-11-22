class Solution {
    static Stack<String> stack= new Stack<>();
    public String decodeString(String s) {
        int i=0;
        int n=0;
        String res="";
        while(i<s.length()){
            if(s.charAt(i)=='['){
                int inc=1;
                i++;

                String subs="";
                while(true){
                    if(s.charAt(i)==']')inc--;
                    if(s.charAt(i)=='[')inc++;
                    if(inc==0) break;
                    subs+=s.charAt(i);
                    i++;
                }

                String retString = decodeString(subs);
                for(int j=0;j<n;j++){
                    res+=retString;
                }

                n=0;

            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res+=s.charAt(i);

            }else{
                n = n*10+(s.charAt(i)-'0');
            }
            i++;
        }
        return res;
    }
}
