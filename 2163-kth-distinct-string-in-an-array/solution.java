class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        List<String> str= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1){
                if(!str.contains(arr[i]))
                {
                    str.add(arr[i]);
                }
            }
        }
        if(k>str.size())return "";
        String ans=str.get(k-1);
        return ans;
    }
}
