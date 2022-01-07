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
    
    int size;
    
    ListNode head;

    public Solution(ListNode h) {
        
        size = 0; head = h;
        
        while (h != null) {
            size++;
            h = h.next;
        }
        
    }
    
    public int getRandom() {
        
        int random = (int) Math.ceil(Math.random() * size);
        
        random--;
        
        ListNode l = head;
        
        // System.out.println(random+" in "+size);
        
        while (random-- > 0)
            l = l.next;
        
        return l.val;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */