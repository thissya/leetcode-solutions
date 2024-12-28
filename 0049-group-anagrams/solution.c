/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
void sorted(char* str){
    int n=strlen(str);
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(str[i]>str[j]){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
}

typedef struct {
    char* key;
    char** group;
    int groupsize;
    int capacity;
}HashMapEntry;

int findkey(HashMapEntry* map,int mapsize,char* key){
    for(int i=0;i<mapsize;i++){
        if(strcmp(map[i].key,key)==0){
            return i;
        }
    }
    return -1;
}

char*** groupAnagrams(char** strs, int strsSize, int* returnSize, int** returnColumnSizes) {
    HashMapEntry* map=(HashMapEntry *)malloc(sizeof(HashMapEntry)*strsSize);
    int mapsize=0;

    for(int i=0;i<strsSize;i++){
        char* sort=strdup(strs[i]);
        sorted(sort);

        int ind=findkey(map,mapsize,sort);
        if(ind==-1){
            map[mapsize].key = malloc(sizeof(char)*(strlen(sort)+1));
            strcpy(map[mapsize].key,sort);
            map[mapsize].group = (char **)malloc(sizeof(char *)*strsSize);
            map[mapsize].group[0]=strs[i];
            map[mapsize].groupsize=1;
            map[mapsize].capacity=strsSize;
            mapsize++;
        }else{
            map[ind].group[map[ind].groupsize++]=strs[i];
            free(sort);
        }
    }
    char*** result =(char ***)malloc(sizeof(char **)*mapsize);
    *returnColumnSizes = (int *)malloc(sizeof(int *)*mapsize);
    *returnSize=mapsize; 

    for(int i=0;i<mapsize;i++){
        result[i]=map[i].group;
        (*returnColumnSizes)[i]=map[i].groupsize;
        free(map[i].key);
    }
    free(map);
    return result;
}
