package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {

	 public static int[] intersection(int[] nums1, int[] nums2) {
	        
		
		
		HashMap<Integer,Integer> nums1HMap=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> nums2HMap=new HashMap<Integer,Integer>();
		
		for(int num:nums1){
			if(nums1HMap.get(num)==null){
				nums1HMap.put(num, 0);
			}
		}
		
		
		for(int num:nums2){
			
			if(nums2HMap.get(num)==null){
				nums2HMap.put(num, 0);
			}
		}
		
		ArrayList<Integer> resultList=new ArrayList<Integer>();
		
		for(int key:nums2HMap.keySet()){
			
			if(nums1HMap.get(key)!=null){
				resultList.add(key);
			}
			
		}
		int[] result=new int[resultList.size()];
		int arrIndex=0;
		for(int resultValue:resultList){
			result[arrIndex]=resultValue;
			arrIndex++;
		}
		
		return result;
	    }
	
	public static void main(String[] args){
		int[] nums1={1, 2, 2, 1};
		int[] nums2={2,2};
		
		ArrayIntersection.intersection(nums1, nums2);
	}
}
