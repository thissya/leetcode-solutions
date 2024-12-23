class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
        int max=0;
        int n=candies.length;
        for(int i=0;i<n;i++){
            max=Math.max(candies[i],max);
        }
        List<Boolean> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+ex >=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}
