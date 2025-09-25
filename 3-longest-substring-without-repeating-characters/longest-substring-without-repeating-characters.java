class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int l=0;
        int r=0;
        int lwindow=Integer.MIN_VALUE;
        while(r<s.length()){
            char x=s.charAt(r);

            while(set.contains(x)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(x);
            r++;
            
            lwindow=Math.max(lwindow,r-l);
            

        }
        return lwindow==Integer.MIN_VALUE ? 0:lwindow;
    }
}