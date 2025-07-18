class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,n,res);
        }
        return res;
    }
    public static void dfs(int current, int n , List<Integer> res){
        if(current>n) return ;
        res.add(current);
        for(int i=0;i<=9;i++){
            int next = current*10 + i;
            //if(next>n) return ;
            dfs(next,n,res);
        }
    }
}

/*
public List<Integer> lexicalOrder(int n) {
        String[] arr = new String[n];
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr[i-1] = String.valueOf(i);
        }    
        Arrays.sort(arr);
        for(String str:arr){
            res.add(Integer.valueOf(str));
        }
        return res;
    }

*/

