class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> common = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    common.put(list1[i],i+j);
                    min=Math.min(min,i+j);
                    break;
                }
            }
        }
        ArrayList<String> res= new ArrayList<>();
        for(Map.Entry<String,Integer> val:common.entrySet()){
            if(val.getValue()==min){
                res.add(val.getKey());
            }
        }
        return res.toArray(new String[0]);
        // String ans[]= new String[res.size()];
        
        // for(int i=0;i<res.size();i++){
        //     ans[i]=res.get(i);
        // }
        // return ans;
    }
}
