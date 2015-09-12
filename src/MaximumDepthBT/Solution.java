/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;

public class Solution {
    public int maxDepth(TreeNode root) 
    {
        Arraylist<TreeNode> queue = new ArrayList<TreeNode>();     
        queue.add(root);
        TreeNode end_node = root;
        int max_depth=0;
        while(!queue.isEmpty())
        {
            TreeNode pop = queue.get(0);
            queue.remove(0);
            if (pop.left!=null)
            {
                queue.add(pop.left);
            }
            if (pop.right!=null)
            {
                queue.add(pop.right);
            }
            if(pop==endNode)
            {
                max_depth+=1;
                end_node = queue.get(queue.size()-1);
            }
        }
        return max_depth;
    }
}
