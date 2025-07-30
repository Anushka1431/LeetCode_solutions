class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        q.addAll(map.keySet());
        //strings are immuatable so we need a stringbuilder 
        StringBuilder ans=new StringBuilder();
        while(!q.isEmpty()){
            char c=q.remove();
            for(int i=0;i<map.get(c);i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}