class Solution {
    public int convertTime(String current, String correct) {
        String[] arr = current.split(":");
        String[] arr1 = correct.split(":");
        
        int time1 = Integer.valueOf(arr[0])*60 + Integer.valueOf(arr[1]);
        int time2 = Integer.valueOf(arr1[0])*60 + Integer.valueOf(arr1[1]);
        int time = time2 - time1;
        int i=0;
        int c=0;
        int[] times = {60,15,5,1};
        while(time>0){
            if(time>=times[i]){
                c++;
                time-=times[i];
            }else{
                i++;
            }
        }
        return c;
    }
}
