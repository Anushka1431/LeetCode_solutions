//use a linked list cycle solution. so this is a list of all the square sums. make a funtion of finding the next square sum. take fast and slow pointers and make sure if there is only one loop and stop it from repeating. slow!=fast that means . and one slow has to be 1 then.

class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int findsquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}