class Solution {
    class Node {
        int pos, val;
        Node(int pos, int val) {
            this.pos = pos; this.val = val;
        }
    }
    public int[] maxSlidingWindow(int[] a, int k) {
        
        int n = a.length, ansp = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>((va, vb) -> vb.val - va.val);
        
        for (int i = 0; i < k; i++)
            pq.offer(new Node(i, a[i]));
        
        int[] ans = new int[n - k + 1];
        
        ans[ansp++] = pq.peek().val;
        
        for (int i = k; i < n; i++) {
            
            int first = i - k + 1;
            
            pq.offer(new Node(i, a[i]));
            
            while(!pq.isEmpty() && pq.peek().pos < first) pq.poll();
            
            ans[ansp++] = pq.peek().val;
            
        }
        
        return ans;
        
    }
}