/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 dummy->7->0->8 add l1 and l2 value in carry. put the %10 value in a new node in the list. then keep the carry and add next l1 and l2 to it 
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy=new ListNode(0);
       ListNode curr=dummy;
       int carry=0;
       while(l1!=null||l2!=null||carry>0){
        if(l1!=null){
            carry+=l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            carry+=l2.val;
            l2=l2.next;
        }
        curr.next=new ListNode(carry%10);
        carry/=10;
        curr=curr.next;
       }
        return dummy.next;
}}