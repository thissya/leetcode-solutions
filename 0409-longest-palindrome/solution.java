class Solution {
    public int longestPalindrome(String s) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int ans=0,odd=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='a' && c<='z')
            {
                arr1[c-'a']++;
            }
            else{
                arr2[c-'A']++;
            }
        }
        for(int a:arr1)
        {
            ans+=(a/2)*2;
            if(a%2!=0)
            {
                odd=1;
            }
        }
        for(int a:arr2)
        {
            ans+=(a/2)*2;
            if(a%2!=0)
            {
                odd=1;
            }
        }
        return ans+odd;
    }
}
