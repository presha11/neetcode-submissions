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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null )

        return true;

        int leftHeight =  calcHeight(root.left);
        int rightHeight = calcHeight(root.right);

        if( Math.abs(leftHeight - rightHeight) >1)
        return false;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right;
    }

    public int calcHeight(TreeNode root)
    {
        if(root == null)
        return 0;
       return 1 + Math.max(calcHeight(root.left), calcHeight(root.right));
    }
}
