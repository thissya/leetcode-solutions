int findTheWinner(int n, int k) {
    int pow=0;
    for(int i=2;i<=n;i++)
    {
        pow=(pow+k)%i;
    }
    return pow+1;
}
