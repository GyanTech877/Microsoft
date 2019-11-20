/*
Binary Tree Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values.
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution1 {
    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inOrder(root);
        return result;
    }
    private void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }
}

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution2 {
    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp=root;
        while(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
        while(!stack.isEmpty()){
            temp= stack.pop();
            result.add(temp.val);
            if(temp.right!=null){
                temp=temp.right;
                while(temp!=null){
                    stack.push(temp);
                    temp=temp.left;
                }
            }
        }
        return result;
    }
    
}
