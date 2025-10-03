/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21*/
import java.util.*;
class ReverseInteger{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print(reverse(x));
	}
	public static int reverse(int x){
		long rev=0;
		while(x!=0){
			int digit=x%10;
			rev=rev*10+digit;
			x=x/10;
		}
		if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
		return (int)rev;
	}
}
