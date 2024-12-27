int maxArea(int* height, int n) {
    int area=0;
    int l=0,r=n-1;
    while(l<r){
        int min=INT_MAX;
        int b=r-l;
        if(height[l]<height[r]){
            min=height[l];
            l++;
        }else{
            min=height[r];
            r--;
        }
        int cur = min * b;
        if(area<cur){
            area=cur;
        }
    }
    return area;
}
