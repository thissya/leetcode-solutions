class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ans=1;
        int len=nums.length;
        if(len==1){
            return 1;
        }
        int[] arr= new int[len-1];
        for(int i=0;i<len-1;i++){
            arr[i]=nums[i+1]-nums[i];
            System.out.print(arr[i]+" ");
        }
        int n=0;
        int p=0;
        for(int i=0;i<len-1;i++){
            if(n==0 && p==0){
                if(arr[i]<0){
                    n=1;
                    ans++;
                }else if(arr[i]>0){
                    p=1;
                    ans++;
                }
            }else if(arr[i]==0){
                continue;
            }
            else if(n==1 && arr[i]>0){
                ans++;
                p=1;
                n=0;
            }else if(p==1 && arr[i]<0){
                p=0;
                ans++;
                n=1;
            }else {
                continue;
            }
        }
        return ans;
    }
}
