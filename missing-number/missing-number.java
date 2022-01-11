class Solution {
    public int missingNumber(int[] a) {
        
        int sumExpected = (a.length * a.length + a.length) / 2, sumActual = 0;
        
        for (int x : a)
            sumActual += x;
        
        return sumExpected - sumActual;
        
    }
}