class Solution {
    public long dividePlayers(int[] skill) {
        int sum=0;
        int n=skill.length;
        int[] skillfreq= new int[1001];
        for(int i:skill)
        {
            sum+=i;
            skillfreq[i]++;
        }
        if(sum%(n/2)!=0)return -1;

        int sum_of_team = sum/(n/2);
        long ans=0;
        for(int curskill:skill)
        {
            int temp = sum_of_team-curskill;
            if(skillfreq[temp]==0)return -1;
            ans+=temp*curskill;
            skillfreq[temp]--;
        }
        return ans/2;
    }
}

/*
        Arrays.sort(skill);
        long sum = (long)skill[0]+(long)skill[skill.length-1];
        long ans = (long)skill[0]*(long)skill[skill.length-1];
        int i=1;
        while(i<skill.length-1-i)
        {
            long sum1=(long)skill[i]+(long)skill[skill.length-1-i];
            if(sum!=sum1)return -1;
            ans+=(long)skill[i]*(long)skill[skill.length-1-i];
            i++;
        }
        return ans;
*/
