/*Write a function that reverses a string. The input string is given as an array 
of characters s. You must do this by modifying the input array in-place with 
O(1) extra memory.

Sample test case

case=1
input=batch-A
output=A-hctab

case=2
input=Never_give_up
output=pu_evig_reveN */

import java.util.*;
class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0,right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println(String.copyValueOf(ch));
    }
}
