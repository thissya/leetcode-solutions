int largestPerimeter(int* nums, int n) {
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(*(nums+i)< *(nums+j)){
                int temp= *(nums+i);
                *(nums+i) = *(nums+j);
                *(nums+j)=temp;
            }
        }
    }
    
    for(int i=0;i<n-2;i++)
    {
        if(*(nums+i)< *(nums+i+1)+*(nums+i+2))
        {
            return nums[i]+nums[i+1]+nums[i+2];
        }
    }
    return 0;
}
