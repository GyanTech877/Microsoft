/*
Design an iterator over a binary search tree with the following rules:

Elements are visited in ascending order (i.e. an in-order traversal)
next() and hasNext() queries run in O(1) time in average.
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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */


public class BSTIterator {
    /*
    * @param root: The root of binary tree.
    */
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        // do intialization if necessary
        stack= new Stack<TreeNode>();
        TreeNode temp=root;
        while(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        // write your code here
        return !stack.isEmpty();
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        // write your code here
        TreeNode result = stack.pop();
        TreeNode temp = result;
        if(temp.right!=null){
            temp = temp.right;
            while(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
        }
        return result;
    }
}
