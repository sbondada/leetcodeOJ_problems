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
    public int minDepth(TreeNode root) 
    {
        if(root!=null)
        {
            return getMinDepth(root,1);
        }
        else
        {
            return 0;
        }
    }
    public int getMinDepth(TreeNode root,int height)
    {
        int left=1;
        int right=1;
        if(root.left!=null)
        {
            left = getMinDepth(root.left,height+1);
        }
        if(root.right!=null)
        {
            right = getMinDepth(root.right,height+1);
        }
        if(root.left!=null && root.right!=null)
        {
            return Math.min(left,right);
        }
        else if(root.left==null && root.right==null)
        {
            return height;
        }
        else
        {
            return (root.left==null?right:left);
        }
    }
}
