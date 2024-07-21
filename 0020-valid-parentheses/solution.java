class Solution {
    public boolean isValid(String s) 
    {
        int top=-1;
        char[] arr=new char[10000];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char a=s.charAt(i);
            if(a=='(' || a=='[' ||a=='{')
            {
                arr[++top]=a;
            }
            else{
                if(top==-1)
                {
                    return false;
                }
                char b = arr[top--];
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
}
