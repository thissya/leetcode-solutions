class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int asteroid: asteroids){
            boolean destroyed = false;

            while(!stk.isEmpty() && asteroid<0 && stk.peek()>0 ){
                int top=stk.peek();
                if(top< -asteroid){
                    stk.pop();
                }else if(top == -asteroid){
                    stk.pop();
                    destroyed=true;
                    break;
                }else if(top> -asteroid){
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                stk.add(asteroid);
            }
        }
        int[] arr = new int[stk.size()];
        int i=0;
        for(int val:stk){
            arr[i]=val;
            i++;
        }
        return arr;
    }
}
