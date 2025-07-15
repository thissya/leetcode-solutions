class Solution {

    public boolean vowel(Character a){
        if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
            return true;
        }
        return false;
    }

    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        
        boolean d=false;
        boolean con=false;
        boolean v=false;

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(vowel(c)){
                v=true;
            }else if((c>='a' && c<='z' ) || (c>='A' && c<='Z')){
                con=true;
            }
            else if(Character.isDigit(word.charAt(i))){
               d=true; 
            }else {
                return false;
            }
        }
        if( con && v){
            return true;
        }
        return false;

    }
}
