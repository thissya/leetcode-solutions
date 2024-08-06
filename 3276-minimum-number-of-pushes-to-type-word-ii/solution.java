class Solution {
    public int minimumPushes(String word) {
        int[] arr= new int[26];
        for(int i=0;i<word.length();i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int c=0,ans=0,pos=1;
        for(int i=25;i>=0;i--)
        {
            if(arr[i]==0)break;
            ans+=pos*arr[i];
            c++;
            if(c==8)
            {
                c=0;
                pos++;
            }
        }
        return ans;
    }
}
