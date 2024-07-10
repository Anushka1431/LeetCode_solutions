/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 take 3 pointers previous present and next. this is in place traversal. move the prev to next and then shift all 3 ahead. when the present becomes null as in end of the list then make the previuos as head . hence return previous.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=null;
        while(pres!=null){
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}