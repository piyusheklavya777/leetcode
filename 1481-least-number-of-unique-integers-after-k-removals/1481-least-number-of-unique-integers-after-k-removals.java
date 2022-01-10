class Solution {
    
    class Node {
        int val, freq;
        Node(int val, int freq) {
            this.val = val; this.freq = freq;
        }
    }
    public int findLeastNumOfUniqueInts(int[] a, int k) {
        
        Arrays.sort(a);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((va,vb) -> va.freq - vb.freq);
        
        int i = 0;
        
        while (i < a.length) {
            
            int now = a[i], freq = 1;
            
            while (i < a.length - 1 && a[i+1] == a[i]) {
                i++; freq++;
            }
            
            pq.offer(new Node(a[i], freq));
            
            i++;
            
        }
        
        while (!pq.isEmpty() && k > 0) {
            
            Node now = pq.poll();
            
            if (now.freq > k) {
                
                pq.offer(new Node(now.val, now.freq - k));
                
                k = 0;
                
            } else {
                
                k -= now.freq;
                
            }
            
        }
        
        return pq.size();
        
    }
}