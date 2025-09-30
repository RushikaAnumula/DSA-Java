/*The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.
Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.*/
import java.util.*;
class ConsecutiveCharacters{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(powerofString(s));
	}
	public static int powerofString(String s){
		StringBuilder sb=new StringBuilder(s);
		int count=1,maxPower=1;
		for(int i=1;i<sb.length();i++){
			if(sb.charAt(i)==sb.charAt(i-1)){
				count++;
				maxPower=Math.max(maxPower,count);
			}else{
				count=1;
			}
		}
		return maxPower;
	}
}
