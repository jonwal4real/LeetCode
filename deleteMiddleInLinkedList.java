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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size += 1;
            temp = temp.next;
        }
        if(size<=1) return null;
        size = size/2;
        temp = head;
        ListNode prev = head;
        while(size>0){
            prev = temp;
            temp = temp.next;
            size -= 1;
        }
        prev.next = temp.next;
        return head;
    }
}