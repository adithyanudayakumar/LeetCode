package leetCode;

public class FirstUniqueCharacter {

	
public int firstUniqChar(String s) {
     
	s=s.toLowerCase();
	
	int[] stringFrequency=new int[26];
	
	for(int i=0;i<s.length();i++){
		stringFrequency[s.charAt(i)-'a']++;
	}
	
	for(int i=0;i<s.length();i++){
		if(stringFrequency[s.charAt(i)-'a']==1){
			return i;
		}
	}
	
	
	return -1;
    }
}
