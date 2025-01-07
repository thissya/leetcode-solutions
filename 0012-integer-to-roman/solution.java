class Solution {
    public String intToRoman(int num) {
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
        int i=0;
        int n=nums.length;
        while(num>0 && i<n){
            while(num>=nums[i]){
                res+=sym[i];
                num-=nums[i];
            }
            i++;
        }
        return res;
    }
}
