class Solution {
public:
    vector<int> twoSum(vector<int>& num, int target) {
        int l=0;
        int r=num.size()-1;
        vector<int> arr(2);
        while(l<r){
            int a=num[l]+num[r];
            if(a==target){
                arr[0]=l+1;
                arr[1]=r+1;
                return arr;
            }
            else if ( a < target){
                l++;
            }else{
                r--;
            }
        }
        return arr;
    }
};
