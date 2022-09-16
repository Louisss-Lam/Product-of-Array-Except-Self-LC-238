import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));

	}
	
	public static int[] productExceptSelf(int[] nums) {
		
		int len = nums.length;
		int[] answer = new int[len];
		int[] left = new int[len];
		int[] right = new int[len];
		
		// fill the left array
		left[0] = 1;
		for (int i = 1; i < len; i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		
		// fill the right array 
		right[len-1] = 1;
		for (int i = len-2; i >= 0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		// fill the answer array
		for (int i = 0; i < len; i++) {
			answer[i] = left[i] * right[i];
		}
		
		return answer;
		
		
	}

}
