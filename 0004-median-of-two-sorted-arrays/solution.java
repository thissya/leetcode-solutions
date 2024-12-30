class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr= new int[n+m];
        int i=0;
        for(i=0;i<n;i++){
            arr[i]=nums1[i];
        }    
        for(int j=0;j<m;j++){
            arr[i+j]=nums2[j];
        }
        Arrays.sort(arr);
        int len=m+n;
        double ans=0;
        if(len%2==0){
            int n1=len/2;
            int n2=n1-1;
            ans=(double)(arr[n1]+arr[n2])/2;
        }else{
            int n1=len/2;
            ans=(double)arr[n1];
        }
        return ans;
    }
}
