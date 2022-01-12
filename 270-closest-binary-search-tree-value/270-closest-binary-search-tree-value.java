/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int closestValue(TreeNode r, double t) {
        
        if (r == null) return Integer.MAX_VALUE;

        if (r.val == t) return r.val;
        
        int best;
        
        if (r.val > t)
            best = closestValue(r.left, t);
        else
            best = closestValue(r.right, t);
        
        if (Math.abs(r.val - t) < Math.abs(best - t))
            return r.val;
        else
            return best;
        
    }
}