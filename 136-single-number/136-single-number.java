class Solution {
    public int singleNumber(int[] nums) {
        
        long mask = 0;
        
        for (int x : nums)
            mask ^= x;
        
        return (int)mask;
        
    }
}