bool isAnagram(char* s, char* t) {
    int n=strlen(t);
    int m=strlen(s);
    if(n!=m)return false;
    int arr[126]={0};
    for(int i=0;i<n;i++){
        arr[s[i]]++;
        arr[t[i]]--;
    }
    for(int i=0;i<n;i++){
        if(arr[s[i]]!=0){
            return false;
        }
    }
    return true;
}
