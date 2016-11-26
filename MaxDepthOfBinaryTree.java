package leetCode;

import leetCode.BinarySearchTreeCreation.TreeNode;

public class MaxDepthOfBinaryTree {

	int count=0;
	
	 public int maxDepth(TreeNode root) {
	        
		 
		 if (root == null)
	            return 0;
	        else
	        {
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(root.left);
	            int rDepth = maxDepth(root.right);
	  
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	             else
	                return (rDepth + 1);
	        }
	    }
	 
	 public void inorderTraversal(TreeNode currentNode){
			
			if(currentNode!=null){
				inorderTraversal(currentNode.left);
				count++;
				inorderTraversal(currentNode.right);
			}
		}
	 
	 private static int log(int x, int base)
	 {
		    return (int) (Math.log(x) / Math.log(base));
		}
}
