class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(arr.contains(nums2[i]) ){
                arr.remove(Integer.valueOf(nums2[i]));
                res.add(nums2[i]);
            }
        }
        int[] ret= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ret[i]=res.get(i);
        }
        return ret;
    }
}
