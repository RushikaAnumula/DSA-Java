/*Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
Example 1:
Input: s = "Hello"
Output: "hello"
Example 2:
Input: s = "here"
Output: "here"
Example 3:
Input: s = "LOVELY"
Output: "lovely"*/
import java.util.*;
class ToLowerCase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(lowerCase(s));
	}
	public static String lowerCase(String s){
		StringBuilder str=new StringBuilder();
		for(char c:s.toCharArray()){
			str.append(Character.toLowerCase(c));
		}
		return str.toString();
	}
}
