class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        //nsl => Next Smallest Left (check which element is lesser in the left side) eg: 2 left side there is no smaller so -1;
        int[] nsl= new int[n];
        int[] nsr= new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i = 0;i < n; i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
    
        for(int i = n-1;i >= 0; i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=stk.peek();
            }
            stk.push(i);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            int width = nsr[i]-nsl[i]-1;
            int area = width * heights[i];
            ans = Math.max(ans,area);
        }

        return ans;
    }
}
