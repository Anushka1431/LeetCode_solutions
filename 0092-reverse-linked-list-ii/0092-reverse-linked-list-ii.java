/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 basic logic is that we have to put current on left and prev and next and then move ahead till the size of the subset and reverse. then connect two ends . the node before left is leftcon and connect it to the right and then connect rightcon too.
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode prev=null;
        ListNode current=head;
        //parse till prev becomes one node previous node of left and current is left
        for(int i=1;current!=null && i<left;i++){
            prev=current;
            current=current.next;
        }
        //connection before left and after right
        ListNode leftcon=prev;
        ListNode rightcon=current;
        //exchange one by one between left and right
        ListNode next=current.next;
        for(int i=0;i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        //now that the middle subset list is changed i have to join the elemets before and after the subset to the new nodes.
        if(leftcon!=null){
            leftcon.next=prev;
        }
        else{
            head=prev;
        }
        rightcon.next=current;
        return head;
        
    }
}