package leetCode;

public class MoveZerosClass {

	public void moveZeroes(int[] nums) {
		
		int reference=0;
		for(int i=0;i<nums.length;i++){
			reference++;
			
			if(reference>nums.length){
				break;
			}
			
			if(nums[i]==0){
				int orginalPosition=i;
				
				for(int j=orginalPosition;j<(nums.length-1);j++){
					nums[j]=nums[j+1];
				}
				
				nums[(nums.length)-1]=0;
				
				i--;
				
			}
		}
		
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums={0, 0, 0, 3, 12,1};
		
		MoveZerosClass mz=new MoveZerosClass();
		
		mz.moveZeroes(nums);
	}
}
