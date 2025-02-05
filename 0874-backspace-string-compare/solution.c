void reduce(char *arr){
    int write=0;
    for(int read=0;arr[read]!='\0';read++){
        if(arr[read]=='#'){
            if(write>0){
                write--;
            }
        }else{
            arr[write++]=arr[read];
        }
    }
    arr[write]='\0';
}
bool backspaceCompare(char* s, char* t) {
    reduce(s);
    reduce(t);
    printf("%s\n",s);
    printf("%s",t);
    if(strcmp(s,t)){
        return 0;
    }
    return 1;
}
