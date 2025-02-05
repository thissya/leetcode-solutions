class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> map= new HashMap<>();
        int n=indices.length;
        for(int i=0;i<n;i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuilder str= new StringBuilder("");
        for(int i=0;i<n;i++){
            str.append(map.get(i));
        }
        return str.toString();
    }
}
