package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzCode {

	public static void main(String[] args){
		List<String> resultSet = fizzBuzz(15);
		
		for(String item:resultSet){
			System.out.println(item);
		}
		
	}

	public static List<String> fizzBuzz(int i) {
		List<String> resultList=new ArrayList<String>();
		
		for(int j=1;j<=i;j++){
			if( j%3==0 && j%5==0
					){
				resultList.add("FizzBuzz");
			}
			else if( j%3==0 
					){
				resultList.add("Fizz");
			}
			else if( j%5==0
					){
				resultList.add("Buzz");
			}
			else{
				resultList.add(Integer.toString(j));
			}
		}
		return resultList;
		
	}
}
