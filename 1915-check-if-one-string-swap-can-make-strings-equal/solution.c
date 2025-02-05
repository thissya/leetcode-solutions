bool areAlmostEqual(char* s1, char* s2) {
    int arr[26];
    for(int i=0;i<strlen(s1);i++){
        arr[s1[i]-'a']++;
        arr[s2[i]-'a']--;
    }
    for(int i=0;i<26;i++){
        if(arr[i]!=0){
            return 0;
        }
    }
    int n=0;
    for(int i=0;i<strlen(s1);i++){
        if(s1[i]!=s2[i]){
            n++;
        }
    }
    if(n==2|| n==0){
        return 1;
    }
    return 0;
}
