package leetCode;

public class LinkedListClass {

	ListNode rootNode=null;
	public class ListNode {
		      int val;
		      ListNode next;
		     
		      ListNode(int x) { 
		    	  val = x; 
		    	  }
		  }
	
	
	public void addNode(int value){
		
		if(rootNode!=null){
			ListNode previousNode=rootNode;
			ListNode currentNode=rootNode.next;
			
			while(true){
				if(currentNode!=null){
					previousNode=currentNode;
					currentNode=currentNode.next;
				}
				else{
					break;
				}
			} //end of while
			
			currentNode=new ListNode(value);
			previousNode.next=currentNode;
			
			
		}
		else{
			rootNode=new ListNode(value);
		}
	}
	
	public void deleteNodes(int value){
	
		
		ListNode currentNode=rootNode;
		
		ListNode previousNode=null;
		
		while(currentNode!=null){
			
			if(currentNode.val==value){
				if(currentNode==rootNode){
					rootNode=rootNode.next;
				}
				else{
					previousNode.next=currentNode.next;
				}
			}
			else{
				previousNode=currentNode;
			}
			
			currentNode=currentNode.next;
		}
	}
	
	
	public static void main(String[] args){
		
		LinkedListClass linkedObj=new LinkedListClass();
		
		linkedObj.addNode(1);
		linkedObj.addNode(2);
		linkedObj.addNode(3);
		linkedObj.addNode(4);
		linkedObj.addNode(5);
		linkedObj.addNode(2);
		
		linkedObj.deleteNodes(2);
		
		System.out.println("Program completed");
		
	}
}
