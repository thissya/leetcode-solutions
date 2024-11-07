class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        int n=nums2.length;
        for(int i=0;i<nums1.length;i++){
            int cur=nums1[i];
            int f=0;
            int max=nums1[i];
            for(int j=0;j<n;j++){
                if(cur==nums2[j]){
                    f=1;
                }
                if(f==1){                    
                    max=Math.max(max,nums2[j]);
                    if(max>cur){
                        break;
                    }
                }
            }
            if(max==nums1[i])max=-1;
            arr[i]=max;
        }
        return arr;
    }
}
