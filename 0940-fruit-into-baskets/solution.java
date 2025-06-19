class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0,r=0;
        int ans=0;
        int n=fruits.length;
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                ans=Math.max(ans,r-l);
                while(map.size()>2 && l<n){
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l]) ==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }
            r++;
        }
        ans=Math.max(ans,r-l);
        return ans;
    }
}
