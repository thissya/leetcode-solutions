class Solution {
    public int calculate(String s) 
    {
        Stack<Integer> stack= new Stack<>();
        int res=0;
        int num=0;
        s=s.trim();
        char sign='+';
        if(s==null||s.length()==0)
        {
            return 0;
        }
        int f=0;
        int i=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                num=num*10+(c-'0');
            }
           if(!Character.isDigit(c)&& c!=' ' || i == s.length()-1)
           {
                if(sign=='+')
                {
                    stack.push(num);
                }
                else if (sign=='-')
                {
                    stack.push(-num);
                    f=1;
                }
                else if (sign=='*')
                {
                    stack.push(stack.pop()*num);
                    f=1;
                }
                else if (sign=='/')
                {
                    stack.push(stack.pop()/num);
                    f=1;
                }

                sign=c;
                num=0;

           }
           i++;
        }
        while(!stack.isEmpty())
        {
            res+=stack.pop();
        }
        /*char ch='+';
        if(f==0 && s.indexOf(ch) == -1)
        {
            return Integer.parseInt(s);
        }*/
        return res;
        
    }
}
