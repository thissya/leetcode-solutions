#include <stdio.h>
#include <math.h>

int sum(int* arr,int n){
    int s=0;
    for(int i=0;i<n;i++){
        s+=arr[i];
    }
    return s;
}

int trap(int* height, int n) {
    int left[n];
    int max=height[0];
    for(int i=0;i<n;i++){
        if(height[i]>max){
            max=height[i];
        }
        left[i]=max;
    }
    int right[n];
    max=height[n-1];
    for(int i=n-1;i>=0;i--){
        if(max<height[i]){
            max=height[i];
        }
        right[i]=max;
    }
    int arr[n];
    int min=INT_MAX;
    for(int i=0;i<n;i++){
        if(left[i]<right[i]){
            min=left[i];
        }else{
            min=right[i];
        }
        arr[i]=min;
    }
    int sum1=sum(arr,n);
    int sum2=sum(height,n);
    return sum1-sum2;
}


