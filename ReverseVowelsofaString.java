/*Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
Example 2:
Input: s = "leetcode"
Output: "leotcede"*/
import java.util.*;
class ReverseVowelsofaString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(reverseVowels(s));
	}
	public static String reverseVowels(String s){
		if(s.length()==0 || s==null) return s;
		int left=0;int right=s.length()-1;
		String vowels="aeiouAEIOU";
		char[] chars=s.toCharArray();
		while(left<right){
			while(left<right && vowels.indexOf(chars[left])==-1) left++;
			while(left<right && vowels.indexOf(chars[right])==-1) right--;
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--;
		}
		return new String(chars);
	}
}
