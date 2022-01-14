class MedianFinder {
    
    PriorityQueue<Integer> higherHalf, lowerHalf;

    public MedianFinder() {
        
        higherHalf = new PriorityQueue<>(); // contains the higher half of numbers
        lowerHalf = new PriorityQueue<>((va, vb) -> vb - va); // lower half.
        
    }
    
    public void addNum(int num) {
            
        if (lowerHalf.size() > 0 && num < lowerHalf.peek()) {
            lowerHalf.offer(num);
            while (lowerHalf.size() > higherHalf.size())
                higherHalf.offer(lowerHalf.poll());
        }

        else {
            
            higherHalf.offer(num);
            while (higherHalf.size() > lowerHalf.size() + 1)
                lowerHalf.offer(higherHalf.poll());
        }
        
    }
    
    public double findMedian() {
        
        int lowerHalfSize = lowerHalf.size(), higherHalfSize = higherHalf.size();
        
        int totalSize = higherHalfSize + lowerHalfSize;
        
        if (totalSize % 2 == 0)
            return (
            lowerHalf.peek() + 
            higherHalf.peek()
        ) / 2d;
        else
            return higherHalf.peek();
        
    }
}

/*
-1
===
-2
-3
*/

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */