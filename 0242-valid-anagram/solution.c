bool isAnagram(char* s, char* t) {
    int n=strlen(s);
    int n1=strlen(t);
    if(n!=n1)
    {
        return false;
    }
    int arr[126]={0};
    for(int i=0;i<n;i++)
    {
        arr[s[i]]++;
        arr[t[i]]--;
    }
    for(int i=0;i<126;i++)
    {
        if(arr[i]!=0)
        {
            return false;
        }
    }
    return true;
}
