class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) 
    {
        int n=profits.length;
        int[][] project= new int[n][2];
        for(int i=0;i<n;i++)
        {
            project[i][0]=profits[i];
            project[i][1]=capital[i];
        }    
        Arrays.sort(project,(a,b)->a[1]-b[1]);
        int i=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        while(k>0)
        {
            while(i<capital.length && project[i][1]<=w)
            {
                pq.add(project[i][0]);
                i++;
            }
            if(pq.isEmpty())
            {
                break;
            }
            int first=pq.poll();
            w+=first;
            k--;
        }
        return w;
    }
}
