class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        String sep="\\"+separator;
        for(int i=0;i<words.size();i++){
            String[] temp = words.get(i).split(sep);
            for(int j=0;j<temp.length;j++){
                if(!temp[j].isEmpty())res.add(temp[j]);
            }
        }
        return res;
    }
}
