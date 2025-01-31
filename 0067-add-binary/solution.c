char* addBinary(char* a, char* b) {
    int n1=strlen(a)-1;
    int n2=strlen(b)-1;
    int carry = 0;
    int i=0;
    char *str=(char *)malloc(sizeof(char)*(n1+n2+3));
    while(n1>=0 || n2>=0 ||carry){
        if(n1>=0){
            carry +=a[n1]-'0';
            n1--;
        }
        if(n2>=0){
            carry+=b[n2]-'0';
            n2--;
        }
        str[i] = (carry%2)+'0';
        i++;
        carry/=2;
    }   
    str[i]='\0';
    int l=0,r=i-1;
    while(l<r){
        char temp=str[l];
        str[l] = str[r];
        str[r] = temp;
        l++;
        r--;
    } 
    return str;
}
