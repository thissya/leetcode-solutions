bool isValid(char* s) {
    char stack[10000];
    int top=-1;
    int n=strlen(s);
    for(int i=0;i<n;i++){
        if(s[i]=='{' || s[i]=='(' || s[i]=='['){
            top++;
            stack[top]=s[i];
        }else if(top==-1){
            return 0;
        }else if(s[i]=='}' || s[i]==')' ||s[i]==']'){
            if(s[i]=='}' && stack[top]=='{'){
                top--;
            }else if(s[i]==')' && stack[top]=='('){
                top--;
            }else if(s[i]==']' && stack[top]=='['){
                top--;
            }else{
                return 0;
            }
        }
    }
    if(top==-1){
        return 1;
    }
    return 0;
}
