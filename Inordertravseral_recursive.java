package BinaryTree;
import java.util.LinkedList;
import java.util.List;

public class Inordertravseral_recursive {
	
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
		List<Integer> result=new LinkedList<>();
		if(root==null) {
			return null;
		}
		
		result.addAll(inorderTraversal(root.left));
		result.add(root.val);
		result.addAll(inorderTraversal(root.right));
		
		return result;
	}

}
