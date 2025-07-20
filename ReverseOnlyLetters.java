/*Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.
Example 1:
Input: s = "ab-cd"
Output: "dc-ba"
Example 2:
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"*/

import java.util.*;
class ReverseOnlyLetters{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  char arr[]=s.toCharArray();
	  int left=0,right=arr.length-1;
	  while(left<right){
	    if(!Character.isLetter(arr[left])){
		    left++;
	    }
	    else if(!Character.isLetter(arr[right])){
		    right--;
	    }
	    else{
		    char temp=arr[left];
  		  arr[left]=arr[right];
  		  arr[right]=temp;
  		  left++;
  		  right--;
	    }
    }
    System.out.println(new String(arr));
  }
}
