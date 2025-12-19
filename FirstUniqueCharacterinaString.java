/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1*/
import java.util.*;
class FirstUniqueCharacterinaString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(firstUniqchar(s));
	}
	public static int firstUniqchar(String s){
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++){
			char c=s.charAt(i);
			if(sb.indexOf(String.valueOf(c))==sb.lastIndexOf(String.valueOf(c))) return i;
		}
		return -1;
	}
}
