class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        for(int i:set1){
            if(!set2.contains(i)){
                l1.add(i);
            }
        }
        for(int i:set2){
            if(!set1.contains(i)){
                l2.add(i);
            }
        }
        List<List<Integer>> NL= new ArrayList<>();
        NL.add(l1);
        NL.add(l2);
        return NL;

    }
}
