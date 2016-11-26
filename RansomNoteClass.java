package leetCode;

import java.util.HashMap;

public class RansomNoteClass {

	
	 public static boolean canConstruct(String ransomNote, String magazine) {
	     
		 HashMap<Character,Integer> ransomNoteMap=new HashMap<Character,Integer>();
		 boolean clearFlag=true;
		 
		 char[] ransomChar = ransomNote.toCharArray();
		 
		 for(char rChar:ransomChar){
			 
			 if(ransomNoteMap.get(rChar) != null){
				 ransomNoteMap.put(rChar, ransomNoteMap.get(rChar)+1);
			 }
			 else{
				 ransomNoteMap.put(rChar,1);
			 }
		 }
		 
		 
		 char[] magazineChar=magazine.toCharArray();
		 
		 HashMap<Character,Integer> magazineMap=new HashMap<Character,Integer>();
		 
		 for(char mChar:magazineChar){
			 
			 if(magazineMap.get(mChar)!=null){
				 magazineMap.put(mChar, magazineMap.get(mChar)+1);
			 }
			 else{
				 magazineMap.put(mChar,1);
			 }
		 }
		
		 
		 for(Character key:ransomNoteMap.keySet()){
			 
			 if(magazineMap.get(key)!=null && magazineMap.get(key)>=ransomNoteMap.get(key)){
				 continue;
			 }
			 else{
				 clearFlag=false;
				 break;
			 }
		 }
		 return clearFlag;
	    }
	 
	 public static void main(String[] args){
		 System.out.println(RansomNoteClass.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
		 
	 }
}
