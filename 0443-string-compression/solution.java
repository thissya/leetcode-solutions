class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder("");
        int[] arr = new int[26];
        int c=1;
        int n=chars.length;
        for(int i=1;i<n;i++){
            if(chars[i-1] == chars[i]){
                c++;
            }else{
                str.append(chars[i-1]);
                if(c>1)
                    str.append(c);
                c=1;
            }
        }
        str.append(chars[n-1]);
        if(c!=1)str.append(c);
        System.out.println(str.toString());
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}
