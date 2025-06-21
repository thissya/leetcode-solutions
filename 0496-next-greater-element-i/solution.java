class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> temp = new ArrayList<>();
        int[] res = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            temp.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            int ind = temp.indexOf(nums1[i]);
            res[i]=check(nums2,ind,nums1[i]);
        }
        return res;
    }
    public int check(int[] nums2,int ind,int cur){
        int temp1=-1;
        for(int i=ind+1;i<nums2.length;i++){
            if(nums2[i]>cur){
                temp1=nums2[i];
                break;
            }
        }
        return temp1;
    }
}
