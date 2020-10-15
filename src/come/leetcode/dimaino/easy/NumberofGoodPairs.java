package come.leetcode.dimaino.easy;

/*
	1512. Number of Good Pairs

	Given an array of integers nums.
	
	A pair (i,j) is called good if nums[i] == nums[j] and i < j.
	
	Return the number of good pairs.
	
	
	Example 1:
	
	Input: nums = [1,2,3,1,1,3]
	Output: 4
	Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
	Example 2:
	
	Input: nums = [1,1,1,1]
	Output: 6
	Explanation: Each pair in the array are good.
	Example 3:
	
	Input: nums = [1,2,3]
	Output: 0
	 
	
	Constraints:
	
	1 <= nums.length <= 100
	1 <= nums[i] <= 100
	
	SUCCESS:
	Runtime: 29 ms, faster than 12.22% of Java online submissions for Number of Good Pairs.
	Memory Usage: 38.8 MB, less than 16.65% of Java online submissions for Number of Good Pairs.
*/

public class NumberofGoodPairs {

	public static void main(String[] args) {
		int[] newA1 = new int[] {1,2,3,1,1,3};
		int[] newA2 = new int[] {1,1,1,1};
		int[] newA3 = new int[] {1,2,3};
		int g = numIdenticalPairs(newA1);
		System.out.println(g);
	}
	
	public static int numIdenticalPairs(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int y = 1 + i; y < nums.length; y++) {
				if(nums[i] == nums[y]) {
				System.out.println("nums[" + i + "] = " + nums[i] + " == " + "nums[" + y + "] = " + nums[y]);
					count++;
				}
			}
		}
		return count;
    }

}
