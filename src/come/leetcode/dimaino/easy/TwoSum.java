package come.leetcode.dimaino.easy;

import java.util.HashMap;

/*
	1. Two Sum
	
	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	You can return the answer in any order.
	
	 
	Example 1:
	
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Output: Because nums[0] + nums[1] == 9, we return [0, 1].
	Example 2:
	
	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:
	
	Input: nums = [3,3], target = 6
	Output: [0,1]
	 
	
	Constraints:
	
	2 <= nums.length <= 105
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.


	SUCCESS:
	Runtime: 1 ms, faster than 99.94% of Java online submissions for Two Sum.
	Memory Usage: 39 MB, less than 11.58% of Java online submissions for Two Sum.
 */

public class TwoSum {

	public static void main(String[] args) {

		TwoSum ts = new TwoSum();
		
		int[] twoSumArray = ts.twoSum(new int[] {1,3,4,8}, 7);
		for(int i: twoSumArray) {
			System.out.println(i);
		}
	}
	
	public int[] twoSumBruteForce(int[] nums, int target) {
        
        int num1 = 0;
		int num2 = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
            	// System.out.println("Trying numbers + " + nums[i] + " + " + nums[j] + " = " + target);
                if((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
                num1 = i;
                num2 = j;
            }
        }
        return new int[] {num1,num2};
    }
	
	/**
	 * Returns the 2 indexes where the arrays index values equal the target number.
	 * 
	 * Creates a HashMap
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		// Make sure if the list is small or if the list is null to return right away.
		if(nums.length < 2 || nums == null) {
			return new int[] {0,0};
		}
		
		// Create a HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		// Loop through nums array
		for(int i = 0; i < nums.length; i++) {
			
			// If the map contains the number in the array
			// return the new array with the map(key) value and i for the new index.
			if(hmap.containsKey(nums[i])) {
				return new int[] {hmap.get(nums[i]), i};
			} else {
				// Add to the HashMap the target - arrays current index at this value and current index.
				hmap.put(target - nums[i], i);
			}
		}

		// Needs return so all code returns have a value.
        return new int[] {0,0};
    }
}