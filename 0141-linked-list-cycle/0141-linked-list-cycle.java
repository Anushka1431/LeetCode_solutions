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
 take a slow and a fast pointer . the fats pointer moves ahead by 2 and slow by 1. if there is no cycle the fats will move ahead and get null. but if there is a cycle in the list then te fast pointer will lopp and will join the slow pointer at some point signalling that there is a cycle.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow=head;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
            
        }
        return false;
    }
}