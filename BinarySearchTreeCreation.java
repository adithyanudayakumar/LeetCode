package leetCode;

public class BinarySearchTreeCreation {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { 
		    	  val = x; 
		    	}
		  }
	
	TreeNode rootNode;
	int count=0;
	
	public void addNode(int value){
		
		if(rootNode==null){
			rootNode=new TreeNode(value);
		}
		else{
			TreeNode currentNode=rootNode;
			TreeNode parentNode;
			while(true){
				
				if(value<currentNode.val){
					
					parentNode=currentNode;
					currentNode=currentNode.left;
					
					if(currentNode==null){
						currentNode=new TreeNode(value);
						parentNode.left=currentNode;
						return;
					}
				} //if value is less than current node value
				
				else{ //if the given value is greater than the current value
					parentNode=currentNode;
					currentNode=currentNode.right;
					
					if(currentNode==null){
						currentNode=new TreeNode(value);
						parentNode.right=currentNode;
						return;
					}
				}
				
				
			} //while
			
			
			
		} // else part - if rootNode is not null
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root==null){
			return null;
		}
			
			 invertTree(root.right);
			 invertTree(root.left);
			 
			TreeNode temp=root.right;
			root.right=root.left;
			root.left=temp;
			return root;
			 
		
    }
	
	public void inorderTraversal(TreeNode currentNode){
		
		if(currentNode!=null){
			inorderTraversal(currentNode.left);
			System.out.println(currentNode.val);
			count++;
			inorderTraversal(currentNode.right);
		}
	}
	
	public void preOrderTraversal(TreeNode currentNode){
		if(currentNode!=null){
			System.out.println(currentNode.val);
			
			preOrderTraversal(currentNode.left);
			preOrderTraversal(currentNode.right);
		}
	}
	
	public static void main(String[] args){
		BinarySearchTreeCreation binaryTree=new BinarySearchTreeCreation();
		
		binaryTree.addNode(50);
		binaryTree.addNode(25);
		binaryTree.addNode(75);
		binaryTree.addNode(30);
		binaryTree.addNode(90); 
		binaryTree.addNode(15);
		binaryTree.addNode(70);
		
		//binaryTree.inorderTraversal(binaryTree.rootNode);
		System.out.println("--------------");
		
//		MaxDepthOfBinaryTree maxDepth=new MaxDepthOfBinaryTree();
//		
//		System.out.println("Max depth is: "+maxDepth.maxDepth(binaryTree.rootNode));
		
		binaryTree.preOrderTraversal(binaryTree.rootNode);
		
		
		System.out.println("--------------");
		
		binaryTree.invertTree(binaryTree.rootNode);
	}
}
