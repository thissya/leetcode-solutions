class Solution {
    public String[] findWords(String[] words) {
        String[] str = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        // int ans=0;
        List<String> ans= new ArrayList<>();
        for(String cur:words){
            int i=0;
            String temp=cur.toLowerCase();
            char c = temp.charAt(0);
            for(String s:str){
                if(s.contains(c+"")){
                    break;
                }
                i++;
            }
            boolean b = true;
            String curString = str[i];
            for(int j=0;j<temp.length();j++){
                if(!curString.contains(temp.charAt(j)+"")){
                    b=false;
                }
            }
            if(b){
                ans.add(cur);
            }
        }
        String[] res = new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
