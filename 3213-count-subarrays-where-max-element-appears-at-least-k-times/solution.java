class Solution {
    public int find(int s,int e,int max,int[] nums){
        int c=0;
        for(int i=s;i<=e;i++){
            if(nums[i]==max){
                c++;
            }
        }
        return c;
    }
    public long countSubarrays(int[] nums, int k) {
        long res = 0;
        int n = nums.length;
        int[] pre = new int[n];

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }
        
        int left=0,c=0;
        for(int right =0;right<n;right++){
            if(nums[right]==max){
                c++;
            }

            while(c>=k){
                res+=(n-right);
                if(nums[left]==max){
                    c--;
                }
                left++;
            }
        }
        return res;
    }
}

/*
time limit exceeded 612 cases passed

class Solution {
    public int find(int s,int e,int max,int[] nums){
        int c=0;
        for(int i=s;i<=e;i++){
            if(nums[i]==max){
                c++;
            }
        }
        return c;
    }
    public long countSubarrays(int[] nums, int k) {
        long res = 0;
        int n = nums.length;
        int[] pre = new int[n];

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }
        
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(j-i+1 < k ){
                    continue;
                }
                if(find(i,j,max,nums)>=k){
                    res++;
                }
            }
        }
        return res;
    }
}
*/
