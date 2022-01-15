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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummyHead = new ListNode(), dummyTail = new ListNode();
        
        dummyHead.next = dummyTail;
        
        ListNode addAtEnd = dummyHead;
        
        Deque<ListNode> temp = new ArrayDeque<>();
        
        while (head != null) {
            
            int count = 1;
            
            while (count <= k && head != null) {
                
                temp.offerFirst(head);
                head = head.next;
                count++;
                
            }
            
            while (!temp.isEmpty()) {
                
                if (count == k + 1)
                    addAtEnd.next = temp.pollFirst();
                else
                    addAtEnd.next = temp.pollLast();
                addAtEnd = addAtEnd.next;
                addAtEnd.next = dummyTail;
                
            }
            
        }
        
        addAtEnd.next = null;
        
        return dummyHead.next;
        
    }
}