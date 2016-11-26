package leetCode;

public class PalindromeCheck {

	 public static boolean isPalindrome(String s) {
	        
	        
	        String formatedInput=s.replaceAll("[^0-9A-Za-z]", "");
	        
	        formatedInput=formatedInput.toLowerCase();
	        int formatedInputLength=formatedInput.length();
	        
	        for(int i=0; i< (formatedInputLength/2);i++){
	        	
	        	if(formatedInput.charAt(i)!=formatedInput.charAt(formatedInputLength-i-1)){
	        		return false;
	        	}
	        }
	        
	        return true;
	    }
	 
	public static void main(String[] args){
		System.out.println(isPalindrome("race a car"));
	}
}
