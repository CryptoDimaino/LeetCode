package come.leetcode.dimaino.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 	859. Buddy Strings
 
	Given two strings A and B of lowercase letters, return true if you can swap two letters in A so the result is equal to B, otherwise, return false.

	Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at A[i] and A[j]. For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
	
	
	Example 1:
	
	Input: A = "ab", B = "ba"
	Output: true
	Explanation: You can swap A[0] = 'a' and A[1] = 'b' to get "ba", which is equal to B.
	Example 2:
	
	Input: A = "ab", B = "ab"
	Output: false
	Explanation: The only letters you can swap are A[0] = 'a' and A[1] = 'b', which results in "ba" != B.
	Example 3:
	
	Input: A = "aa", B = "aa"
	Output: true
	Explanation: You can swap A[0] = 'a' and A[1] = 'a' to get "aa", which is equal to B.
	Example 4:
	
	Input: A = "aaaaaaabc", B = "aaaaaaacb"
	Output: true
	Example 5:
	
	Input: A = "", B = "aa"
	Output: false
	 
	
	Constraints:
	
	0 <= A.length <= 20000
	0 <= B.length <= 20000
	A and B consist of lowercase letters.
	
	
	SUCCESS:
	
	Runtime: 6 ms, faster than 9.50% of Java online submissions for Buddy Strings.
	Memory Usage: 39 MB, less than 10.38% of Java online submissions for Buddy Strings.

*/

public class BuddyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "ab";
		String string2 = "ba";
		
		String string3 = "ab";
		String string4 = "ab";
		
		
		String string5 = "aa";
		String string6 = "aa";
		
		String string7 = "aaaaaaabc";
		String string8 = "aaaaaaacb";
		
		String string9 = "";
		String string10 = "";
		
		System.out.println(buddyStrings(string9, string10));
	}

	public static boolean buddyStrings(String A, String B) {
		if(A.length() != B.length()) {
	    	return false;
	    }
		
		ArrayList<Character> aList = new ArrayList<>();
		ArrayList<Character> bList = new ArrayList<>();
		
		ArrayList<Character> theList = new ArrayList<>();
		
		for(int i = 0; i < A.length(); i++)
		{
			if(A.charAt(i) != B.charAt(i)) {
				aList.add(A.charAt(i));
				bList.add(B.charAt(i));
				if(aList.size() > 2) {
					return false;
				}
			}
			theList.add(A.charAt(i));
		}
		Collections.reverse(aList);
		
		Set<Character> set = new HashSet<>(theList);
		System.out.println(aList);
		System.out.println(bList);
		if(aList.size() == 2 && aList.equals(bList)) {
			return true;
		}
		if(aList.size() == 0) {
			if(theList.size() > set.size()) {
				return true;
			}
		}
		return false;
	}
}