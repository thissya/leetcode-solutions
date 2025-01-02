int recur(char* a,char* b,char* str,int c){
    if(strstr(str,b)!=NULL){
        return c;
    }
    if(strlen(str)>strlen(b)){
        strcat(str,a);
        c++;
        if(strstr(str,b)!=NULL){
            return c;
        }else{
            return -1;
        }
    }
    return recur(a,b,strcat(str,a),c+1);
}
int repeatedStringMatch(char* a, char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);
    char* str=(char *)malloc(sizeof(char)*(lenA+lenB)*2+1);
    return recur(a,b,strcpy(str,a),1);
}
