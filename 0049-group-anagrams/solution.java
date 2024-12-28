class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String str= new String(arr);
            List<String> li= map.getOrDefault(str,new ArrayList<>());
            li.add(s);  
            map.put(str,li);
        }
        List<List<String>> res=new ArrayList<>(map.values());
        return res;
    }
}



/*
Approach 1:

    public  static boolean anagram(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n!=m)return false;
        int[] arr= new int[26];
        for(int i=0;i<n;i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
    public static List<String> find(String s,String[] strs){
        List<String> arr=new ArrayList<>();
        for(String str:strs){
            if(anagram(str,s)){
                arr.add(str);
            }
        }
        return arr;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for(String s:strs){
            List<String> arr = find(s,strs);
            if(!res.contains(arr)){
                res.add(arr);
            } 
        }
        return res;
    }
*/
