/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 measure the length and divide it by k. thats how many times the loop should go. then reverse within that loop from i=0 to k. Attach both the sides after reversing and update the last.
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1||head==null){
            return head ;
        }
        ListNode prev=null;
        ListNode current=head;

        int length=getlength(head);
        int count=length/k;
        while(count>0){
            
            ListNode next=current.next;
            ListNode last=prev;
            ListNode newlast=current;
            for(int i=0;current!=null && i<k;i++){
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }
            else{
                head=prev;
            }
            
            newlast.next=current;
            prev=newlast;
            count--;

        }
        return head;
    }
    public int getlength(ListNode head){
        ListNode p=head;
        int length=0;
        while(p!=null){
            length++;
            p=p.next;
        }
        return length;
    }
}