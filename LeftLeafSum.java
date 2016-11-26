package leetCode;

import leetCode.BinaryTree.TreeNode;

public class LeftLeafSum {
static int sum=0;
	
	 public static int sumOfLeftLeaves(TreeNode root) {
	     
		 traverseTree(root);
		 
		 return sum;
	    }
	 
	private static void traverseTree(TreeNode root) {

		if (root != null) {
			if (root.left != null) {
				TreeNode leftChild = root.left;

				if (leftChild.left == null && leftChild.right == null) {
					sum = sum + leftChild.val;
				}
			}
			traverseTree(root.left);
			traverseTree(root.right);
		}

	}

	public static void main(String[] args){
		
		BinaryTree tree=new BinaryTree();
		
		tree.insert(3);
		tree.insert(9);
		tree.insert(20);
		tree.insert(15);
		tree.insert(7);
		
		System.out.println(LeftLeafSum.sumOfLeftLeaves(tree.rootNode));
		
	}
}
