package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import BinaryTree.Inordertravseral_recursive.TreeNode;

public class InorderTravseral_Iterative {
	public class TreeNode {
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
	
	
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			result.add(curr.val);
			curr = curr.right;
		}
		return result;
	}

}
