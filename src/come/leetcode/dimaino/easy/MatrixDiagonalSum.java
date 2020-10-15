package come.leetcode.dimaino.easy;

/*
	1572. Matrix Diagonal Sum
	
	Given a square matrix mat, return the sum of the matrix diagonals.

	Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
	
	
	Example 1:
	
	Input: mat = [[1,2,3],
	              [4,5,6],
	              [7,8,9]]
	Output: 25
	Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
	Notice that element mat[1][1] = 5 is counted only once.
	Example 2:
	
	Input: mat = [[1,1,1,1],
	              [1,1,1,1],
	              [1,1,1,1],
	              [1,1,1,1]]
	Output: 8
	Example 3:
	
	Input: mat = [[5]]
	Output: 5
	 
	Constraints:
	
	n == mat.length == mat[i].length
	1 <= n <= 100
	1 <= mat[i][j] <= 100
	
	
	SUCCESS: 
	
	Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
	Memory Usage: 38.9 MB, less than 15.74% of Java online submissions for Matrix Diagonal Sum.

 */



public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
		}; // 1 + 5 + 9 + 3 + 7 = 25
		
		int[][] arr1 = {
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		}; // 1 + 7 + 13 + 19 + 25 + 5 + 9 + 13 + 17 + 21 = 130
		
		int[][] arr2 = {
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1}
		}; // 1 + 1 + 1 + 1 + 1 + 1 + 1 = 8
		
		int[][] arr3 = {
				{5}
		}; // 5
		
		System.out.println(diagonalSum(arr1));
	}
	
	public static int diagonalSum(int[][] mat) {
        int length = mat.length;
        
        if(length == 1) {
        	return mat[0][0];
        }

		int sum = 0;
		if((mat.length % 2) != 0) {
			int half = length / 2;
			for(int i = 0; i < length; i++) {
				if(!(i == half && ((length - 1) - i) == half)) {
					sum += mat[i][length - 1 - i];
				}
				sum += mat[i][i];
			}
		} else {
			for(int i = 0; i < length; i++) {
				sum += mat[i][i];
				sum += mat[i][length - 1 - i];
			}
		}
        return sum;
    }
}