package leetCode;

public class BinaryTree {

	TreeNode rootNode=null;
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		      
		  
		 }
	 
	
	 
	 public void insert(int data){
		 
		 if(rootNode==null){
			 rootNode=new TreeNode(data);
		 }
		 else{
			 TreeNode currentNode=rootNode;
			 TreeNode parentNode;
			 
			 
			 while(true){
				 
				 parentNode=currentNode;
				 currentNode=currentNode.left;
				 
				 if(currentNode==null){
					 currentNode=new TreeNode(data);
					 parentNode.left=currentNode;
					 return;
				 }
				 else{
					 currentNode=parentNode.right;
					 
					 if(currentNode==null){
						 currentNode=new TreeNode(data);
						 parentNode.right=currentNode;
						 return;
					 }
				 }
			 } //end of while 
			 
			 
		 }
	 }
	 
}
