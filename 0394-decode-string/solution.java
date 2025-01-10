class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack= new Stack<>();
        Stack<StringBuilder> stack2= new Stack<>();
        int n=0;
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+c-'0';
            }
            else if(c=='['){
                stack.push(n);
                stack2.push(str);
                n=0;
                str=new StringBuilder();
            }else if (c==']'){
                StringBuilder temp =str;
                int val =stack.pop();
                str=stack2.pop();
                while(val>0){
                   str.append(temp);
                   val--; 
                }
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
