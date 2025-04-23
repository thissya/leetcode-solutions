class Solution {
    public int countLargestGroup(int n) {
        if(n<=9){
            return n;
        }   
        
        HashMap<Integer,Integer> map =  new HashMap<>();
        while(n>0){
            int sum = recur(n);
            map.put(sum,map.getOrDefault(sum,0)+1);
            n--;
        }
        int max=0;
        for(int val:map.values()){
            max=Math.max(max,val);
        }
        int c=0;
        for(int val:map.values()){
            if(val==max){
                c++;
            }
        }
        return c;
    }

    public int recur(int n){
        if(n==0){
            return 0;
        }
        return n%10 + recur(n/10);
    }

}
