bool isValid(char* s) {
    char stack[100000];
    int n=strlen(s);
    int top=-1;
    for(int i=0;i<n;i++)
    {
        char a=s[i];
        if(a=='(' || a=='[' || a=='{')
        {
            stack[++top]=a;
        }
        else{
            if(top==-1)
            {
                return false;
            }
            char b=stack[top--];
            if(a==')' && b!='(')
            {
                return false;
            }
            
            if(a==']' && b!='[')
            {
                return false;
            }
            
            if(a=='}' && b!='{')
            {
                return false;
            }   
        }
    }
    return top==-1;
}
