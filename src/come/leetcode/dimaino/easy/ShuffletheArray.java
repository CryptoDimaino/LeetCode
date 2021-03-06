package come.leetcode.dimaino.easy;

/*
	1470. Shuffle the Array

	Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

	Return the array in the form [x1,y1,x2,y2,...,xn,yn].
	
	
	Example 1:
	
	Input: nums = [2,5,1,3,4,7], n = 3
	Output: [2,3,5,4,1,7] 
	Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
	Example 2:
	
	Input: nums = [1,2,3,4,4,3,2,1], n = 4
	Output: [1,4,2,3,3,2,4,1]
	Example 3:
	
	Input: nums = [1,1,2,2], n = 2
	Output: [1,2,1,2]
	 
	
	Constraints:
	
	1 <= n <= 500
	nums.length == 2n
	1 <= nums[i] <= 10^3

	SUCCESS:
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
	Memory Usage: 39.3 MB, less than 17.80% of Java online submissions for Shuffle the Array.
*/

public class ShuffletheArray {

	public static void main(String[] args) {
		int[] newA1 = new int[] {2,5,1,3,4,7};
		int[] newA2 = new int[] {1,2,3,4,4,3,2,1};
		int[] newA3 = new int[] {1,1,2,2};
		
		int[] newA = shuffle(newA3, 2);
		for(int i : newA) {
			System.out.println(i);
		}
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] newArray = new int[nums.length];
		int firstHalf = 0;
		int secondHalf = n;
		for(int i = 0; i < nums.length; i += 2) {
			newArray[i] = nums[firstHalf];
			newArray[i+1] = nums[secondHalf];
			firstHalf++;
			secondHalf++;
		}
        return newArray;
    }
}
