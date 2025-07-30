class Solution {
    public int beautySum(String s) {
        int beauty=0;
        for(int i=0;i<s.length();i++){
            int[] count=new int[26];
            for(int j=i;j<s.length();j++){
                ++count[s.charAt(j)-'a'];

                int minf=500;
                int maxf=0;
                for(int f:count){
                    if(f>0){
                        minf=Math.min(minf,f);
                        maxf=Math.max(maxf,f);
                    }
                }
                beauty+=maxf-minf;

            }
        }
        return beauty;
    }
}