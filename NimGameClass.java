package leetCode;

public class NimGameClass {

	
	public static void main(String[] args){
		System.out.println(canWinNim(4));
	}

	private static boolean canWinNim(int n) {
		
		boolean winPossiblity=true;
		
		if(n==4 || n==0){
			winPossiblity=false;
		}
		
		return winPossiblity;
	}
}
