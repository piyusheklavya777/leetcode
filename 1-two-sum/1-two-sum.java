class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> location = new HashMap<>();
        
        Integer suppliment;
        
        for (int i = 0; i < nums.length; i++)
            location.put(nums[i], i);
        
        for (int i = 0; i < nums.length; i++) {
            suppliment = location.getOrDefault(target-nums[i], Integer.MAX_VALUE);
            if (suppliment == Integer.MAX_VALUE || suppliment == i)
                continue;
            return new int[] {i, suppliment};
        }
        
        throw new IllegalArgumentException();
    }
}