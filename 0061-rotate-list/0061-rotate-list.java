/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 make the last conect to head. in 1 2 3 4 5 6 if k=2 then 5 will be new head. so take a newlast till 4 and make the next of that ie 5 ur new head and make newlast connect to null.
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null||head.next==null){
            return head;
        }
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            length++;
            last=last.next;
            
        }
        last.next=head;
        ListNode newlast=head;
        int rotations=k%length;
        int skips=length-rotations;
        for(int i=0;i<skips-1;i++){
            newlast=newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        return head;
    }
}