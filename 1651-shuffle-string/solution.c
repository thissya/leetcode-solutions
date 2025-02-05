char* restoreString(char* s, int* indices, int indicesSize) {
    char *arr = malloc(sizeof(char)*(indicesSize+1));
    for(int i=0;i<indicesSize;i++){
        arr[indices[i]]=s[i];
    }
    arr[indicesSize]='\0';
    return arr;
}
