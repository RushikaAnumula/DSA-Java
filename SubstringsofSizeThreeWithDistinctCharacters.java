/*A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".
Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
Constraints:
1 <= s.length <= 100
s​​​​​​ consists of lowercase English letters.*/
import java.util.*;
class SubstringsofSizeThreeWithDistinctCharacters{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.print(countGoodSubstrings(s));
	}
	public static int countGoodSubstrings(String s){
		int count=0;
        for(int i=0;i<=s.length()-3;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);
            if(a!=b && b!=c && a!=c){
                count++;
            }
        }
        return count;
	}
}
