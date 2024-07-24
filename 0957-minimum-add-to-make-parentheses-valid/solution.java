class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> arr= new Stack<>();
        int count=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
                arr.push(c);
            else if(arr.isEmpty())
                count++;
            else
                arr.pop();
        }
        return count+arr.size();
    }
}
