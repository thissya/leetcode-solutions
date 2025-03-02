class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int[] n:nums1){
            map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        }
        for(int[] n:nums2){
            map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        }
        int ind=0;
        int[][] res = new int[map.size()][2];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res[ind][0]=entry.getKey();
            res[ind][1]=entry.getValue();
            ind++;
        }
        return res;
    }
}
