class Solution {
public:
    int second(vector<int>& nums,int target){
        int l=0,r=nums.size()-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                ans=mid;
            }
            if(nums[mid]<=target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
    int first(vector<int>& nums,int target){
        int l=0,r=nums.size()-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
            if(nums[mid]==target){
                ans=mid;
            }
        }
        return ans;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> arr={-1,-1};
        arr[0]=first(nums,target);
        arr[1]=second(nums,target);
        return arr;
    }
};
