class Solution {
    public int nthUglyNumber(int n) {
        if(n==1)return 1;
        int[] arr= new int[n];
        arr[0]=1;
        int i2=0,i3=0,i5=0;
        int n2=2,n3=3,n5=5;
        for(int i=1;i<n;i++)
        {
            int ugly=Math.min(n2,Math.min(n3,n5));
            arr[i]=ugly;
            if(ugly==n2)
            {
                i2++;
                n2=arr[i2]*2;
            }
            if(ugly==n3)
            {
                i3++;
                n3=arr[i3]*3;
            }
            if(ugly==n5)
            {
                i5++;
                n5=arr[i5]*5;
            }
        }
        return arr[n-1];
    }
}
