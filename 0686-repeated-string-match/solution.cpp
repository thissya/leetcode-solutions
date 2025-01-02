class Solution {
public:
    int recur(string a,string b,string str,int c){
        if(str.contains(b)){
            return c;
        }
        if(str.length() > b.length() ){
            str=str+a;
            c++;
            if(str.contains(b)){
                return c;
            }else{
                return -1;
            }
        }
        return recur(a,b,str+a,c+1);

    }
    int repeatedStringMatch(string a, string b) {
        return recur(a,b,a,1);
    }
};
