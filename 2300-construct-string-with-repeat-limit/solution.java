class Solution {
    public String repeatLimitedString(String s, int L) {
        char[] arr = s.toCharArray();
        TreeMap<Character,Integer> map = new TreeMap<>(Comparator.reverseOrder());

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        StringBuilder str= new StringBuilder("");

        while(!map.isEmpty()){
            Map.Entry<Character,Integer> val = map.pollFirstEntry();
            char curchar=val.getKey();
            int curval=val.getValue();

            int usecount=Math.min(curval,L);

            str.append(String.valueOf(curchar).repeat(usecount));

            curval-=usecount;

            if(!map.isEmpty() && curval>0){
                Map.Entry<Character,Integer> next=map.pollFirstEntry();
                char nextKey = next.getKey();
                int nextval= next.getValue();

                str.append(nextKey);
        
                if(nextval>1){
                    map.put(nextKey,nextval-1);
                }
                map.put(curchar,curval);
            }else if(curval>0){
                break;
            }
        }
        return str.toString();
    }
}


/*
solution 1: 144/150 testcases
class Solution {
    public String repeatLimitedString(String s, int L) {
        char[] arr = s.toCharArray();
        String str="";
        Arrays.sort(arr);
        TreeMap<Character,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int n = map.size();
        int prev=0;
        char[] unique= new char[n];
        int i=0;
        for(Map.Entry<Character,Integer> val : map.entrySet()){
            unique[i]=val.getKey();
            System.out.println(unique[i]);
            i++;
        }
        i=0;
        while(n!=0 && i<unique.length){
            int c=map.get(unique[i]);
            int num=c;
            if(c==0){
                n--;
            }
            if(prev==1){
                str+=unique[i];
                map.put(unique[i],map.get(unique[i])-1);
                i--;
                prev=0;
                continue;
            }
            if(num>L){
                prev=1;
                map.put(unique[i],c-L);
                num=L;
            }
            while(num>0){
                str+=unique[i];
                num--;
            }
            if(c<L){
                n--;
            }
            i++;
        }
        return str;
    }
}
*/
