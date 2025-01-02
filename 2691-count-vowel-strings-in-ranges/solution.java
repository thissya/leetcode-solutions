class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        List<Character> chars=Arrays.asList('a','e','i','o','u');
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            String str=words[i];
            char f=str.charAt(0);
            char l=str.charAt(str.length()-1);
            if((f=='a' || f=='e' || f=='i'|| f=='o'||f=='u') && (l=='a' || l=='e' || l=='i'|| l=='o'||l=='u')){
                prefix[i+1]=prefix[i]+1;
            }else{
                prefix[i+1]=prefix[i];
            }
        }
        int[] res= new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end=queries[i][1];
            res[i]=prefix[end+1]-prefix[start]; 
        }
        return res;
    }
}

/*
            int n=queries.length;
        int[] res = new int[n];
        Character[] character={'a','e','i','o','u'};
        List<Character> li = Arrays.asList(character);
        
        for(int i=0;i<n;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int ans=0;
            while(start<=end){
                String s=words[start];
                if(li.contains(s.charAt(0)) && li.contains(s.charAt(s.length()-1))){
                    ans++;
                }
                start++;
            }
            res[i]=ans;
        }
        return res;
*/
