class Solution {
    public HashMap<Character,String> map = new HashMap<>();
    public List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        bt(digits,0,new StringBuilder());
        return res;
    }

    public void bt(String digit,int ind,StringBuilder  str){
        if(ind==digit.length()){
            res.add(str.toString());
            return ;
        }
        String cur = map.get(digit.charAt(ind));
        for(char c:cur.toCharArray()){
            str.append(c);
            bt(digit,ind+1,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
