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
        
        ListNode sp = head.next, fp = head.next.next;
        
        while (fp != null) {
            if (sp == fp) return true;
            sp = sp.next;
            if (fp.next == null || fp.next.next == null) return false;
            fp = fp.next.next;
        }
        
        return false;
        
    }
}