class Solution {
    public boolean canPlaceFlowers(int[] bed, int toPlant) {
        
        int n = bed.length, planted = 1, notPlanted = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (toPlant == 0) break;
            
            if (bed[i] == planted) continue;
            
            if (
                (i == 0 || bed[i-1] == notPlanted) && 
                (i == n-1 || bed[i+1] == notPlanted)
            ) {
                
                bed[i] = 1;
                toPlant--;
                i++;
            }
            
        }
        
        return toPlant == 0;
        
    }
}