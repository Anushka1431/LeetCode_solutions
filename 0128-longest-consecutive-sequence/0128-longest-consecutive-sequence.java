//hashset searching in in O(1) and a hashset only stores unique values 
//check if a number exists who doesnt have num-1 i.e this is start of the sequence then keep adding +1 and increasing streak. like this fnd the longest streak
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int num: nums){
            hset.add(num);
        }
        int streak=0;
        for(int num:hset){
            if(!hset.contains(num-1)){
                int current=num;
                int currentstreak=1;
                while(hset.contains(current+1)){
                    current +=1;
                    currentstreak+=1;
                }
                streak=Math.max(streak,currentstreak);
            }
        }
        return streak;
    }
}