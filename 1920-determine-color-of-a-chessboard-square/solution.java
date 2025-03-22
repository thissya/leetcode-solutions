class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n = coordinates.charAt(0)-'a' +1;
        int m = (coordinates.charAt(1))-'1'+1;
        if((n+m)%2==0){
            return false;
        }
        return true;
    }
}
