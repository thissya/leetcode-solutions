class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
        if(n==0)return true;
        for(int i=0;i<bed.length;i++){
            if(bed[i]!=1 &&(i==0 || bed[i-1]!=1 ) &&  (i==bed.length-1 || bed[i+1]!=1)){
                n--;
                bed[i]=1;
                if(n==0)return true;
            }   
        }
        
        return false;
    }
}
