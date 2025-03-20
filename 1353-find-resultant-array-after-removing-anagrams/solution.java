class Solution {
    public boolean anagram(String a,String b){
        int n=a.length();
        int m=b.length();
        if(n!=m){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']--;
        }
        for(int i=0;i<n;i++){
            if(arr[a.charAt(i)-'a'] != 0){
                return false;
            }
        }
        return true;
    }

    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> res = new ArrayList<>(Arrays.asList(words));
        for(int i=1;i<res.size();i++){
            if(anagram(res.get(i-1),res.get(i))){
                res.remove(i);
                i--;
            }        
        }           
        return res;  
    }
}
