/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false*/
import java.util.*;
class ValidAnagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        char sa[]=s.toCharArray();
        char ta[]=t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        if(new String(sa).equals(new String(ta))){
            System.out.println(true);
        }
        else{
	          System.out.println(false);
	      }
    }
}
