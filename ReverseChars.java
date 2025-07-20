/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"*/
import java.util.*;
class ReverseChars{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
	    s=s.trim();
	    String chars[]=s.split(" ");
	    for(int i=0;i<chars.length;i++){
	      chars[i]=new StringBuilder(chars[i]).reverse().toString();
	    }
	    String result=String.join(" ",chars);
	    System.out.println(result);
    }
}
