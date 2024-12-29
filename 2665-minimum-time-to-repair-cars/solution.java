class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=0;
        long r=(long)1e14;
        while(l<r){
           long mid=(l+r)/2;
           long count=0;
           for(int rank:ranks){
            count+=(long)Math.sqrt((double)mid/rank);
           } 
           System.out.println("Count :"+count);
           System.out.println("Mid   :"+mid);
           System.out.println();
           if(count>=cars){
                r=mid;
           }else{
            l=mid+1;
           }
        }
        return l;
    }
}
