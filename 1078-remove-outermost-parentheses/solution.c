char* removeOuterParentheses(char* s) {
    int n=strlen(s);
    char *res=malloc(sizeof(char)*n);
    int o=0;
    int ind=0;
    for(int i=0;i<n;i++){
        if(s[i]=='('){
            o++;
        }
        if(o>1){
            res[ind]=s[i];
            ind++;
        }
        if(s[i]==')'){
            o--;
        }
    }
    res[ind]='\0';
    return res;
}
