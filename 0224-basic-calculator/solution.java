class Solution {
    public int calculate(String s) 
    {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        int res=0;
        int sign=1;
        int f=0;
        s = s.trim();
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
            else if (c=='+')
            {
                res+=(sign*num);
                num=0;
                sign=1;
                f=1;
            }
            else if(c=='-')
            {
                res+=(sign*num);
                num=0;
                sign=-1;
                f=1;
            }
            else if(c=='(')
            {
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
                f=1;
            }
            else if(c==')')
            {
                res+=(sign*num);
                num=0;
                res*=stack.pop();
                res+=stack.pop();
                f=1;
            }
        }
        res+=(sign*num);
        if(f==0)
        {
            int n=Integer.parseInt(s);
            if(res<n)
            {
                return n;
            }
        }
        return (int)res;
    }
}
