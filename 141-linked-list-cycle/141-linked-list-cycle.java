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
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null || head.next.next == null) return false;
        
        ListNode slow = head.next, fast = head.next.next;
        
        while(fast != null) {
            
            if (fast == slow) return true;
            
            slow = slow.next;
            
            if (fast.next == null) return false;
            if (fast.next.next == null) return false;
            
            fast = fast.next.next;
            
        }
        
        throw new IllegalArgumentException();
        
    }
}