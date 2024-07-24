class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        for(String temp:strs)
        {
            List<String> temp_res=anagram(temp,strs);
            if(!res.contains(temp_res))
            {
                res.add(temp_res);
            }  
        }
        return res;
    }
    public static List<String> anagram(String temp,String[] strs)
    {
        List<String> temp_res=new ArrayList<>();
        for(String s:strs)
        {
            if(isanagram(temp,s))
            {
                temp_res.add(s);
            }
        }
        return temp_res;
    }
    public static boolean isanagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())return false;
        int[] arr=new int[26];
        for(char c:s1.toCharArray())
        {
            arr[c-'a']++;
        }
        for(char c:s2.toCharArray())
        {
            arr[c-'a']--;
        }
        for(int i:arr)
        {
            if(i!=0)return false;
        }
        return true;
    }
}
