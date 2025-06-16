class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int ans=0;
        int n=people.length;
        int r=n-1;

        while(l<=r){
            if(people[l]+people[r] <=limit){
                l++;
            }
            r--;
            ans++;
        }

        return ans;
    }
}
