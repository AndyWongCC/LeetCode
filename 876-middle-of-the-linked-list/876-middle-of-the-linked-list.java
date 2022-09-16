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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){ //odd:current-null; even:next-null
            fast = fast.next.next; //equal to division.
            slow = slow.next; //skip the first one is becasue it returns the second one.
        }
        return slow;
    }
}