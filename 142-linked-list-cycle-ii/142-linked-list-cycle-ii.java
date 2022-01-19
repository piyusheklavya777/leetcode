/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if ( head == null || head.next == null || head.next.next == null ) return null;
        
        ListNode slow = head.next, fast = head.next.next;
        
        while (slow != fast) {
            
            slow = slow.next;
            
            if (fast.next == null || fast.next.next == null) return null;
            
            fast = fast.next.next;
            
        }
        
        while (head != slow) {
            
            head = head.next;
            
            slow = slow.next;
        }
        
        return head;
        
    }
}