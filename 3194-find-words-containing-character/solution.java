class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        String X = String.valueOf(x);
        for(int i = 0; i < words.length;i++){
            if(words[i].contains(X)){
                res.add(i);
            }
        }        
        return res;
    }
}
