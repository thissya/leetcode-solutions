class Solution {
    public String convertToBase7(int num) {
        Stack<Integer> stack= new Stack<>();
        if(num==0)return "0";
        while(num!=0){
            stack.push(num%7);
            num=num/7;
        }    
        StringBuilder str= new StringBuilder("");
        while(!stack.isEmpty()){
            str.append(stack.peek());
            stack.pop();
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='-'){
                str.deleteCharAt(i);
            }
        }
        return str.toString();
    }
}
