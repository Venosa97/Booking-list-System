package exClasassssssssssss;

public class BinarySearch {
	
	  public int search(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        int half = (left + right)/2;
	        
	        
	        while (true){
	            if (nums[half] == target){
	                return half;
	            }
	            if (nums[half] < target){
	                left = half + 1;
	            } else if (nums[half] > target){
	                right = half - 1;
	            }
	            half = (left + right) / 2;
	            if (left > right){
	               break;
	            }
	        }
	        return -1;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
