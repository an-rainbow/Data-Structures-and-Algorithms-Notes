# 559. Maximum Depth of N-ary Tree
## BFS
public class Number559 {

	public int maxDepth(Node root) {
	if(root==null) {
		return 0;
	}
	
	int depth=0;
	
	Queue<Node> queue=new LinkedList<>();
	queue.offer(root);
	
	while(!queue.isEmpty()) {
		int size=queue.size();
		
		for(int i=0; i<size; i++) {
			Node currentNode=queue.poll();
			for(Node child: currentNode.children) {
				queue.offer(child);
			}
		}
		
		depth++;
	}
	
	return depth;
	}
  
  ## DFS
  class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int max=0;
        
        for(Node child: root.children){
            max=Math.max(max, maxDepth(child));
        }
        
        return max+1;
    }
}

## Iterative DFS

     	public int maxDepth(Node root) {
         if(root == null) return 0;
         
         Stack<Node> stack = new Stack<>();
         Stack<Integer> depth = new Stack<>();
         stack.push(root);
         depth.push(1);
         int max = 1;
        
         while(!stack.isEmpty()) {
             Node n = stack.pop();
             int d = depth.pop();
            
             for(Node node: n.children) {
                 max = Math.max(d + 1, maxDepth);
                 stack.push(node);
                 depth.push(d + 1);
             }
         }
        return max;
     }
 }
