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
    public boolean hasPathSum(TreeNode root, int sum) 
    {
        if(root!=null)
        {
            return recurBranchSum(root,sum,0);   
        }
        else
        {
            return false;
        }
    }
    public boolean recurBranchSum(TreeNode root,int sum,int psum)
    {
        boolean left = false;
        boolean right = false;
        if(root.left!=null)
        {
            left = recurBranchSum(root.left,sum,psum+root.val);
        }
        if(root.right!=null && left!=true)
        {
            right = recurBranchSum(root.right,sum,psum+root.val);
        }
        if(root.left==null && root.right==null)
        {
             if(psum+root.val==sum)
                {
                    return true;
                }
                else
                {
                    return false;
                }
        }
        return left ||right;
    }
}
