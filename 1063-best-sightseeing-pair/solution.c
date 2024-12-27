#define MAX(x,y) ((x)>(y)? (x):(y))

int maxScoreSightseeingPair(int* values, int n) {
    int maxi=values[0]+0;
    int ans=0;
    for(int i=1;i<n;i++){
        ans=MAX(ans,maxi+values[i]-i);
        maxi=MAX(maxi,values[i]+i);
    }
    return ans;
}
