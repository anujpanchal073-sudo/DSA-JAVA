
//Plateform - Leetcode
//QuestionId - 129
//Difficulty - Medium

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 


public class Sum_Root_To_Leaf_Numbers {

    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }

        return addNumbers(root, 0, 0);
    }

    public int addNumbers(TreeNode node, int sum, int curr){

        curr = curr * 10 + node.val;
        
        if(node.left == null && node.right == null){
            sum += curr;
        }

        if(node.left != null){
            sum = addNumbers(node.left, sum, curr);
        }

        if(node.right != null){
            sum = addNumbers(node.right, sum, curr);
        }

        return sum;

    }
        
}