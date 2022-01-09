class Solution {
    class Node {
        int pos, val;
        Node(int pos, int val) {
            this.pos = pos; this.val = val;
        }
    }
    public int[] maxSlidingWindow(int[] a, int k) {
        
        int n = a.length, ansp = 0;
        
        ArrayDeque<Node> q = new ArrayDeque<>();
        
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && q.peekLast().val <= a[i]) q.pollLast();
            q.offerLast(new Node(i, a[i]));
        }
        
        int[] ans = new int[n - k + 1];
        
        ans[ansp++] = q.peekFirst().val;
        
        for (int i = k; i < n; i++) {
            
            int first = i - k + 1;
            
            while (!q.isEmpty() && q.peekLast().val <= a[i]) q.pollLast();
            q.offerLast(new Node(i, a[i]));
            
            while(!q.isEmpty() && q.peekFirst().pos < first) q.pollFirst();
            
            ans[ansp++] = q.peekFirst().val;
            
        }
        
        return ans;
        
    }
}