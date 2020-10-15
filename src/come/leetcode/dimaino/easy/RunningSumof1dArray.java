package come.leetcode.dimaino.easy;

/*
	1480. Running Sum of 1d Array
	
	Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

	Return the running sum of nums.
	
	
	Example 1:
	
	Input: nums = [1,2,3,4]
	Output: [1,3,6,10]
	Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
	Example 2:
	
	Input: nums = [1,1,1,1,1]
	Output: [1,2,3,4,5]
	Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
	Example 3:
	
	Input: nums = [3,1,2,10,1]
	Output: [3,4,6,16,17]
	 
	
	Constraints:
	
	1 <= nums.length <= 1000
	-10^6 <= nums[i] <= 10^6
	
	
	SUCCESS:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
	Memory Usage: 39.2 MB, less than 12.39% of Java online submissions for Running Sum of 1d Array.
*/

public class RunningSumof1dArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4}; // [1,3,6,10]
		int[] nums1 = {1,1,1,1,1}; // [1,2,3,4,5]
		int[] nums2 = {3,1,2,10,1}; // [3,4,6,16,17]
		
		System.out.println();
		for(int num: runningSum(nums2)) {
			System.out.print(num + ", ");
		}
	}
	
    public static int[] runningSum(int[] nums) {
    	int length = nums.length;
    	int[] newArray = new int[length];
    	for(int i = 0; i < length; i++) {
    		if(i == 0) {
    			newArray[i] += nums[i];
    		} else {
    			newArray[i] += newArray[i - 1] + nums[i];
    		}
    	}
        return newArray;
    }
}
