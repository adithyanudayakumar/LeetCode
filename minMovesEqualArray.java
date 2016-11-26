package leetCode;

public class minMovesEqualArray {

	
	//minimum moves= sum(array) - (n*smallestElement)
	public int minMoves(int[] nums) {
        int smallestElement=Integer.MAX_VALUE;
        
        int sum=0;
        
        int n=nums.length;
        
        for(int num:nums){
        	if(num<smallestElement){
        		smallestElement=num;
        	}
        	sum=sum+num;
        }
        
		
		
		return sum-(n*smallestElement);
    }
	
	public static void main(String[] args){
		minMovesEqualArray obj=new minMovesEqualArray();
		int[] a={8,9,9};
		System.out.println(obj.minMoves(a));
	}
}