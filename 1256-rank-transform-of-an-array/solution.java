class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res=Arrays.stream(arr).distinct().sorted().toArray();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<res.length;i++)
        {
            map.put(res[i],i+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
