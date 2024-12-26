int lengthOfLastWord(char* s) {
    int c=1;
    for(int i=1;i<strlen(s);i++){
        if(s[i]==' ')continue;
        if(s[i-1]==' ')c=0;
        c++;
    }
    return c;
}
