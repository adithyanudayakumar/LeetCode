package leetCode;

public class FindDifference {
	 public static char findTheDifference(String s, String t) {
	      
		 char[] sArray=s.toCharArray();
		 int sTotal=0;
		 char[] tArray=t.toCharArray();
		 int tTotal=0;
		 
		 for(int i=0;i<sArray.length;i++){
			 sTotal=sTotal+sArray[i];
		 }
		 

		 for(int i=0;i<tArray.length;i++){
			 tTotal=tTotal+tArray[i];
		 }
		 
		 int diffChar=tTotal-sTotal;
		 
		 
		 return (char)diffChar;
	    }
	
	public static void main(String[] args){
		System.out.println(findTheDifference("abcd","abcde"));
	}
}
