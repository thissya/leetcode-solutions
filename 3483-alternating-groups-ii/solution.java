class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;
        int[] tab= new int[n];
        for(int i=0;i<n;i++){
            tab[i] = (colors[i]!=colors[(i+1)%n])?1:0;
        }
        int sum=0;
        int pair=k-1;
        for(int i=0;i<pair;i++){
            sum+=tab[i];
        }
        if(sum==pair){
            count++;
        }
        for(int i=1;i<n;i++){
            sum-=tab[i-1];
            sum+=tab[(i+pair-1)%n];
            if(sum==pair){
                count++;
            }
        }
        return count;
    }
}
