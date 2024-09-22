class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] arr= new String[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1] = String.valueOf(i);
        }
        Arrays.sort(arr);
        List<Integer> res= new ArrayList<>();
        for(String str:arr)
        {
            res.add(Integer.valueOf(str));
        }
        return res;
    }
}
