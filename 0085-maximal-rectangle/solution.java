class Solution {
    public int longestArea(int[] heights){
        int n = heights.length;
        
        Stack<Integer> stk = new Stack<>();
        int[] nsl = new int[n];
        int[] nsr = new int[n];

        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }    
            if(stk.isEmpty()){
                nsl[i] = -1;
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
                nsr[i]=  stk.peek();
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

    public int maximalRectangle(char[][] matrix) {
        int[] heights= new int[matrix[0].length];
        int res=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            res = Math.max(res,longestArea(heights));
        }    
        return res;
    }
}
