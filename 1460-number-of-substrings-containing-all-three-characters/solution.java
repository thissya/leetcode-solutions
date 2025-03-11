class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        int[] arr ={0,0,0};
        int l=0;
        for(int r=0;r<n;r++){
            arr[s.charAt(r)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                arr[s.charAt(l)-'a']--;
                c+=n-r;
                l++;
            }
        }
        return c;
    }
}
