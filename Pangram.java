/*A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:
Input: sentence = "leetcode"
Output: false*/
import java.util.*;
class Pangram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		System.out.print(isPangram(sentence));
	}
	public static boolean isPangram(String sentence){
		Set<Character> set=new HashSet<>();
		for(char c:sentence.toCharArray()) set.add(c);
		return set.size()==26;
	}
}
