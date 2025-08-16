/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d*/
import java.util.*;
class MergeStringsAlternatelyCharArray{
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length(),l2=word2.length();
        char[] merged=new char[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            merged[k++]=word1.charAt(i++);
            merged[k++]=word2.charAt(j++);
        }
        while(i<l1) merged[k++]=word1.charAt(i++);
        while(j<l2) merged[k++]=word2.charAt(j++);
        return new String(merged);
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		MergeStringsAlternatelyCharArray obj=new MergeStringsAlternatelyCharArray();
		String word1=sc.next();
		String word2=sc.next();
		System.out.print(obj.mergeAlternately(word1,word2));
	}
}
