class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        List<Character> v= new ArrayList<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        int res=0;
        for(int i=left;i<=right;i++){
            String temp=words[i];
            if(v.contains(temp.charAt(0)) && v.contains(temp.charAt(temp.length()-1))){
                res++;
            } 
        }
        return res;    
    }
}
