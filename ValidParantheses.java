/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Example 4:
Input: s = "([])"
Output: true
Example 5:
Input: s = "([)]"
Output: false*/
import java.util.*;
class ValidParantheses{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int length;
	do{
    length=s.length();
	  s=s.replace("()","");
	  s=s.replace("{}","");
	  s=s.replace("[]","");
  }while (s.length() !=length);
	System.out.println(s.isEmpty());
  }
}     
