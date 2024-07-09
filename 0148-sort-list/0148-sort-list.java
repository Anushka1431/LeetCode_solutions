/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 take the mid of the linked list and make the prev of that null so that list is split in 2 halves. Then make a fuction to merge 2 lists with merge sort. Then in the main funtion slpit 2 lists with mid funcion and put the sortlist recursively on left and right part and then merge them. also put a check for null head.
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=midpoint(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge(left,right);
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode head=new ListNode();
        ListNode tail=head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }

        }
        tail.next=(list1!=null)?list1:list2;
        return head.next;
    }
    public ListNode midpoint(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }

}