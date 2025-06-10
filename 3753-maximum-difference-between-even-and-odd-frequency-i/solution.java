class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(char c:map.keySet()){
            if( (map.get(c)%2==0)&& min>map.get(c)){
                min=map.get(c);
            }
            if( (map.get(c)%2!=0) && max<map.get(c) ){
                max=map.get(c);
            }
        }
        System.out.println(max+" "+min);
        return (max-min);
    }
}
