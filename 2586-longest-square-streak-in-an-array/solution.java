class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
           set.add(n);
        } 
        List<Integer> setArr= new ArrayList<>(set);
        Collections.sort(setArr);
        int c=0;
        int max=-1;
        for(int i=0;i<setArr.size();i++){
            int cur=setArr.get(i);
            c=0;
            while(set.contains(cur)){
                set.remove(cur);
                cur*=cur;
                c++;
            }
            max=Math.max(max,c);
        }
        return max>1?max:-1;
    }
}
