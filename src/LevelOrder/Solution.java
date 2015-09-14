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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();                     
        queue.add(root);
        TreeNode end = root;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        while(!queue.isEmpty() && root!=null)
        {
            TreeNode pop = queue.get(0);
            queue.remove(0);
            temp.add(pop.val);
            if(pop.left!=null)
            {
                queue.add(pop.left);
            }
            if(pop.right!=null)
            {
                queue.add(pop.right);
            }
            if(pop==end)
            {
                result.add(temp);
                temp = new ArrayList<Integer>();
                if(!queue.isEmpty())
                {
                    end = queue.get(queue.size()-1);
                }
            }
        }
        return result;
    }
}
