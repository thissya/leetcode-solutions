class Solution {
    public int[] findEvenNumbers(int[] d) {
        int n=d.length;
        int[] freq = new int[10];
        for(int i=0;i<n;i++){
            freq[d[i]]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<10;i++){
            if(freq[i]==0)continue;
            freq[i]--;
            for(int j=0;j<10;j++){
                if(freq[j]==0)continue;
                freq[j]--;
                for(int k=0;k<=8;k+=2){
                    if(freq[k]==0)continue;
                    freq[k]--;
                    int cur = i*100 + j*10 + k;
                    res.add(cur);
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;
        }
        Collections.sort(res);
        int len = res.size();
        int[] ret = new int[len];
        for(int i=0;i<len;i++){
            ret[i]=res.get(i);
        }
        return ret;
    }
}
