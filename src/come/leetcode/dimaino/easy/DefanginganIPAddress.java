package come.leetcode.dimaino.easy;

/*
	1108. Defanging an IP Address

	Given a valid (IPv4) IP address, return a defanged version of that IP address.

	A defanged IP address replaces every period "." with "[.]".
	
	
	Example 1:
	
	Input: address = "1.1.1.1"
	Output: "1[.]1[.]1[.]1"
	Example 2:
	
	Input: address = "255.100.50.0"
	Output: "255[.]100[.]50[.]0"
	 
	
	Constraints:
	
	The given address is a valid IPv4 address.
	
	SUCCESS: 
	Runtime: 4 ms, faster than 15.62% of Java online submissions for Defanging an IP Address.
	Memory Usage: 37.1 MB, less than 17.84% of Java online submissions for Defanging an IP Address.
*/

public class DefanginganIPAddress {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
		System.out.println(defangIPaddr("255.100.50.0"));
	}
	
	public static String defangIPaddr(String address) {
		String[] octet = address.split("\\.");
		String str = "";
		for(int i = 0; i < octet.length; i++) {
			if(i != 3) {
				str += octet[i] + "[.]";				
			} else {
				str += octet[i];
			}
		}
		return str;
    }
}
