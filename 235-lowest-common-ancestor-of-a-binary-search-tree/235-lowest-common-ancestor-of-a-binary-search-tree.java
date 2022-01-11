/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode r, TreeNode p, TreeNode q) {
        
        if (p.val < r.val && q.val < r.val)
            return lowestCommonAncestor(r.left, p, q);
        
        if (p.val > r.val && q.val > r.val)
            return lowestCommonAncestor(r.right, p, q);
        
        return r;
        
    }
}