class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> dict = new HashSet<>(dictionary);
        String[] words=sentence.split(" ");
        StringBuilder result= new StringBuilder();
        for(String word : words)
        {
            if(result.length()>0)
            {
                result.append(" ");
            }
            result.append(find(word,dict));
        }
        return result.toString();
    }
    String find(String word,Set<String> dict)
    {
        for(int i=1;i<=word.length();i++)
        {
            String prev=word.substring(0,i);
            if(dict.contains(prev))
            {
                return prev;
            }
        }
        return word;
    }
}
