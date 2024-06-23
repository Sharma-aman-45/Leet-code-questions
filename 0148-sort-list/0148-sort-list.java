/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static ListNode merge(ListNode left,ListNode right){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                temp.next = left;
                left = left.next;
                }
              else{
                temp.next = right;
                right = right.next;
              }
              temp = temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        
      return head.next;

    }
    public static ListNode findmid(ListNode head){
       
        ListNode fastnode = head;
        ListNode slownode = head;
         if(head==null||head.next==null){
            return head;
        }
        fastnode = fastnode.next;
        while(fastnode!=null&&fastnode.next!=null){
            slownode = slownode.next;
            fastnode = fastnode.next.next;
        }
        ListNode mid = slownode.next;
        slownode.next = null;
        return mid;
    }
    public ListNode sortList(ListNode head) {
         if(head==null||head.next==null){
            return head;
        }
        ListNode mid = findmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        ListNode newhead = merge(left,right);
        return newhead;
    }
}