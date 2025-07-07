class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        
        int[] nsl = new int[n];
        int[] nsr = new int[n];

        for(int i=0;i<n;i++){
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

        for(int i=n-1;i>=0;i--){
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

        int res=0;
        for(int i=0;i<n;i++){
            int width = nsr[i]-nsl[i]-1;
            int area = width*heights[i];
            res=Math.max(res,area);
        }
        return res;
    }
}
