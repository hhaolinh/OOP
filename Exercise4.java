package uk.ac.cam.hh645.OOP;
 

public class Exercise4{
	public static void main(String[] args) {
		
	}
	public static int[] positives(int[] nums){
    	int count = 0;
		for(int i = 0;i < nums.length; i++){
			if (nums[i] > 0){
				count += 1;
			}
		}
    	int[] pos = new int[count];
    	int j = 0;
    	int i = 0;
    	while (j < count){
    		if (nums[i] > 0){
    			pos[j] = nums[i];
    			j += 1;
    		}
    		i += 1;
    	}
    	return pos;
	}

	public static int sum(int[] nums){
    	int total = 0;
	    for(int i = 0;i < nums.length; i++){
	    	total += nums[i];
	    }
    	return total;
	}
	public static int[] cumsum(int[] nums){
	    for(int i = 1;i < nums.length; i++){
	        nums[i] = nums[i]+nums[i-1];
	    }
		return nums;
	}
}