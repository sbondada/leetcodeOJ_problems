/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) 
    {
        return recur_deep(root,0); 
    }
    public int recur_deep(TreeNode root, int height)
    {
        if(root!=null)
        {
            int left = recur_deep(root.left,height+1);
            int right = recur_deep(root.right,height+1);
            return Math.max(left,right);
        }
        else
        {
            return height;
        }
    }
}
