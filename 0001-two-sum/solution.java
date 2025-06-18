class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sum=0;
        int l=0,n=nums.length;
        int r=n-1;
        int[] nums2=new int[n];
        for(int i=0;i<n;i++){
            nums2[i]=nums[i];
        }
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int[] res = {-1,-1};
        while(l<r){
            sum=nums[l]+nums[r];
            if(sum>target){
                r--;
            }
            else if(sum<target){
                l++;
            }
            if(sum==target){
                left=nums[l];
                right=nums[r];
                break;
            }
        }

        boolean le =true;
        System.out.println(left+" "+right);
        for(int i=0;i<n;i++){
            if(left ==nums2[i] || right==nums2[i]){
                if(le){
                    res[0]=i;
                    le=false;
                }else{
                    res[1]=i;
                }
            }
        }

        return res;
    }
}

/*
    
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            int cur = target-nums[i];
            if(arr.contains(cur) && arr.indexOf(cur)!=i){
                return new int[]{i,arr.indexOf(cur)};
            }
        }
        return new int[]{-1,-1};
        
*/
