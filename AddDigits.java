package leetCode;

public class AddDigits {

public static int addDigits(int num) {
        int result=0;
        
        result = (int) (num-9*Math.floor((num-1)/9));
        
        return result;
    }

public static void main(String[] args){
		System.out.println(AddDigits.addDigits((Integer) null));
	}
}
