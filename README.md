# Recursion

**[5 Simple Steps for Solving Any Recursive Problem](https://www.youtube.com/watch?v=ngCos392W4w)**
- *This vedio expained recursion foundmentals with graphs and animation, good to get the concept.*

# DFS
**[Depth First Search (DFS) Explained: Algorithm, Examples, and Code](https://www.youtube.com/watch?v=PMMc4VsIacU)**
- *Animation for DFS 

**[Depth-First Search (DFS), Topological Sort](https://www.youtube.com/watch?v=AfSk24UTFS8)**
- *MIT DFS course 50 mins, need to watch later

**[InOrder, PreOrder, PostOrder Traverse, easy tricks](https://www.youtube.com/watch?v=98AGQU0z2wg)**
- *A video shows how to do traverse with tricks

# BFS
**[Breadth First Search (BFS): Visualized and Explained](https://www.youtube.com/watch?v=xlVX7dXLS64)**
- *Animation for BFS

**[Breadth-First Search (BFS)](https://www.youtube.com/watch?v=s-CYnVz-uh4)**
- *MIT BFS Course 50 mins, need to watch later

**[559. Maximum Depth of N-ary Tree](https://www.youtube.com/watch?v=TtAflDtqwVg)**
- *Leetcode question 559, with recursion, BSF and DFS
- [Click here for codes](https://github.com/asrmrc/Data-Structures-and-Algorithms-Notes/blob/main/Recursion.md)


Inorder Travsersal **[LeetCode Q144](https://leetcode.com/problems/binary-tree-preorder-traversal/)**
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Iterative:

Recursion:
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
  List<Integer> result = new ArrayList<Integer>();
        if (root != null){
            result.add(root.val);
            result.addAll(preorderTraversal(root.left));
            result.addAll(preorderTraversal(root.right));
        }
        return result;
  }

