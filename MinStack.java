package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MinStack {

	ArrayList<Integer> stackList=null;
	ArrayList<Integer> tempList=null;
	
	/** initialize your data structure here. */
    public MinStack() {
    	stackList=new ArrayList<Integer>();
    }
    
    public void push(int x) {
    	stackList.add(x);
    }
    
    public void pop() {
    	stackList.remove(stackList.size()-1);
    }
    
    public int top() {
        return  (stackList.size()!=0)?stackList.get(stackList.size()-1):Integer.MAX_VALUE;
    }
    
    public int getMin() {
    	 tempList=stackList;
    	 Collections.sort(tempList);
    	 return (tempList.size()!=0)?tempList.get(0):Integer.MAX_VALUE;
    }
}

