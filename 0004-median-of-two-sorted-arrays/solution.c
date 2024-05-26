void merge(int *arr,int arrsize,int *nums,int s){
    for(int i=0;i<arrsize;i++)
    {
        arr[s]=nums[i];
        s++;
    }
}
void sort(int *arr,int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[i]<arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int n=nums1Size+nums2Size;
    int arr[n];
    merge(arr,nums1Size,nums1,0);
    merge(arr,nums2Size,nums2,nums1Size);
    sort(arr,n);
    printf("%d",n);
    double c=0;
    int half=n/2;
    if(n%2==0)
    {
        int a=arr[half];
        int b=arr[half-1];
        c=(double)(a+b)/2;
    }
    if(n%2!=0)
    {
        c=arr[half];
    }
    return c;
}
