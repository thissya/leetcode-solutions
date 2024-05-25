int isalphanum(char c)
{
    return (c>='a' && c<='z') || (c>='A'&&c<='Z')|| (c>='0'&&c<='9');
}
int lower(char c)
{
    return (c>='A'&&c<='Z')? c+32:c;
}
bool isPalindrome(char* s) {
    int l=0;
    int r=strlen(s)-1;
    while(l<=r)
    {
        if(isalphanum(s[l]))
        {
            if(isalphanum(s[r]))
            {
                if(lower(s[l])!=lower(s[r]))
                {
                    return 0;
                }
                l++;
                r--;
            }
            else{
                r--;
            }
        }
        else{
            l++;
        }
    }
    return 1;
}
