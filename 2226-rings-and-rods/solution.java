class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        HashMap<Integer,List<Character>> map = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            char c=rings.charAt(i);
            i++;
            int r=Integer.valueOf(rings.charAt(i));
            List<Character> temp=map.getOrDefault(r,new ArrayList<>());
            if(!temp.contains(c)){
                temp.add(c);
            }
            if(temp.size()==3){
                temp.add('q');
                count++;
            }
            map.put(r,temp);
        }
        return count;
    }
}
