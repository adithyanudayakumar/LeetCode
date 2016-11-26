package leetCode;

import leetCode.LinkedListClass.ListNode;

public class DeleteNodeClass {

	//Delete except the tail node
	 public void deleteNode(ListNode node) {
		 if(node.next!=null){
	        node.val=node.next.val;
	        node.next=node.next.next;
		 }
	    }
	 
}
