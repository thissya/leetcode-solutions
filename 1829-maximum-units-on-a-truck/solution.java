class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1] - a[1]);
        int n=boxTypes.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int b=boxTypes[i][0];
            int c=boxTypes[i][1];
            if(truckSize>b){
                res += b*c;
                truckSize-=b;
            }else{
                res += truckSize*c;
                break;
            }
            if(truckSize<=0){
                break;
            }
        }
        return res;
    }
}
