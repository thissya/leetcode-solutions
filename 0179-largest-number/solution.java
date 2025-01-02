class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] res= new String[n];
        for(int i=0;i<n;i++){
            res[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(res,(a,b)-> (b+a).compareTo(a+b));
        if(res[0].equals("0"))return "0";
        String str="";
        for(int i=0;i<n;i++){
            str+=res[i];
        }
        return str;
    }
}
