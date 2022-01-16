class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int start = 0, end = 1;
        
        Arrays.sort(intervals, (va, vb) -> va[start] - vb[start]);
        
        PriorityQueue<Integer> hall = new PriorityQueue<>();
        
        
        for (int[] meet : intervals) {
            
            if (hall.size() == 0 || hall.peek() > meet[start]) {
                //add first room to the hall and engage it with first meeting till meet[end].
                hall.offer(meet[end]);
            }
            else {
                // an idle room is available indicated by the fromt of the pq hall.
                // engage that till meet ends.
                hall.poll();
                hall.offer(meet[end]);
            }
            
        }
        
        return hall.size();        
    }
}