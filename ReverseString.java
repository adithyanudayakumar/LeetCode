package leetCode;

public class ReverseString {

	public static String reverseString(String s){
		StringBuilder stringBldr= new StringBuilder();
			char[] charArray = s.toCharArray();
			
				for(int i=charArray.length-1;i>=0;i--){
					stringBldr.append(charArray[i]);
				}
			return stringBldr.toString();
		}
	
	public static void main(String[] args){
		System.out.println(reverseString("hello"));
	}
}
