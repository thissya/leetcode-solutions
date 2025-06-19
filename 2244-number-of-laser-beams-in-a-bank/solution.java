class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            String str = bank[i];
            int c=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    c++;
                }
            }
            System.out.println(c);
            if(c!=0){
                arr.add(c);
            }
        }
        int sum=0;
        for(int i=0;i<arr.size()-1;i++){
           
            sum+=(arr.get(i)*arr.get(i+1));
        }
        return sum;

    }
}
