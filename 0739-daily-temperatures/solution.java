class Solution {
    class Example{
        int ind;
        int val;
        Example(int _ind,int _val){
            ind = _ind;
            val = _val;
        }
    }

    public int[] dailyTemperatures(int[] temp) {
        Stack<Example> stack= new Stack<>();
        int[] arr= new int[temp.length];  
        int i=0; 
        while(i<temp.length){
            int f=1;
            while(!stack.isEmpty() && stack.peek().val < temp[i]){
                arr[stack.peek().ind]= i - stack.pop().ind;
                f=0;
            }   
            if(!stack.isEmpty() && stack.peek().val > temp[i]){
                stack.push(new Example(i,temp[i]));
                i++;
            } 
            else//(!stack.isEmpty() )
            {
                stack.push(new Example(i,temp[i]));
                i++;
            }
            
        }
        return arr;
    }
}
