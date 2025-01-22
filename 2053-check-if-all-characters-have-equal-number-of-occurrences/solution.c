bool areOccurrencesEqual(char* s) {
    int arr[26];
    for(int i=0;i<strlen(s);i++){
        arr[s[i]-'a']++;
    }
    int f=0;
    for(int i=0;i<strlen(s);i++){
        if(f==0 && arr[s[i]-'a']!=0){
            f=arr[s[i]-'a'];
        }
        if(arr[s[i]-'a']!=0 && f!=arr[s[i]-'a']){
            return false;
        }
    }
    return true;
}
