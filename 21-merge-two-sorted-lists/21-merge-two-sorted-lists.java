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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0); //thats the header of the node[0] -> , we need it becuase we have to start from begin, if we just call the current, we cannot start from begin cause listnode is the one direction.
        ListNode current = header; //pointer to the end of the code
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1=l1.next;
            }
            else{
                current.next = l2;
                l2=l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current.next = l2;
            l2 = l2.next;
        }
     return header.next;   
    }
}