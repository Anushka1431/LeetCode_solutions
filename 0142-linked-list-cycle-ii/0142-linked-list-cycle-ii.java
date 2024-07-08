/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 calculate length of cycle. the starting point of cycle is where the first f and second s pointers meet assume that. so to find this we move s ahead by the length of the cycle. now move both f and s ahead one by one at the same time and they will reach the start of the cycle . 
 */
public class Solution {
    public int lengthCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                do{
                    slow=slow.next;
                    length++;
                }while(slow!=fast);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
            }
        if(length==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}