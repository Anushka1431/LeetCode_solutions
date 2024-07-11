/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 find the mid of the linked list and then reverse the second half. then take the start of that as secondhead and compare . if it is same then true. eg 123321 changes to 123123 compare 1 1 then 22 like that.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        
        ListNode secondhead=reverseList(mid);
        //store the second head in a temporary variable so you can use it again while reversing it back.
        ListNode temp=secondhead;
        while(head!=null && secondhead!=null){
            if(head.val!=secondhead.val){
                break;
            }
            head=head.next;
            secondhead=secondhead.next;
        }
        return head==null||secondhead==null;
    }     
        
        }