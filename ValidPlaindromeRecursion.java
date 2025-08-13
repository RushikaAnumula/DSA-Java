/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
import java.util.*;
class ValidPlaindromeRecursion{
	public boolean isPalindrome(String s){
		return check(s,0,s.length()-1);
	}
	public boolean check(String s,int left,int right){
		if(left>=right) return true;
		if(!Character.isLetterOrDigit(s.charAt(left))) return check(s,left+1,right);
		if(!Character.isLetterOrDigit(s.charAt(right))) return check(s,left,right+1);
		if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
			return false;
		return check(s,left+1,right-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ValidPlaindromeRecursion obj=new ValidPlaindromeRecursion();
		System.out.print(obj.isPalindrome(s));
	}
}
