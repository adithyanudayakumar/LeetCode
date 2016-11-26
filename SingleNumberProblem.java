package leetCode;

import java.util.HashMap;

public class SingleNumberProblem {
	public static int singleNumber(int[] nums) {
		int returnValue=Integer.MIN_VALUE;
		HashMap<Integer, Integer> testMap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			testMap.put(nums[i], 0);
		}
		
		for(int i=0;i<nums.length;i++){
			if(null!=testMap.get(nums[i])){
				int count=testMap.get(nums[i]);
				++count;
				testMap.put(nums[i], count);
			}
			
		} //end of for
		
		for(int i=0;i<nums.length;i++){
			if(1==testMap.get(nums[i])){
				returnValue=nums[i];
			}
		}
		
		return returnValue;
    }
	
	public static void main(String[] args){
		int[] abc = {2,2,3,3,9,4,4};
		System.out.println(singleNumber(abc));
	}
}
