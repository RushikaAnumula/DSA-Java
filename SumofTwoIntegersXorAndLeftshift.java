/*Given two integers a and b, return the sum of the two integers without using the operators + and -.
Example 1:
Input: a = 1, b = 2
Output: 3
Example 2:
Input: a = 2, b = 3
Output: 5
Constraints:
-1000 <= a, b <= 1000*/
import java.util.*;
class SumofTwoIntegersXorAndLeftshift{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(getSum(a,b));
	}
	public static int getSum(int a, int b){
		if(a==0) return b;
		if(b==0) return a;
		return getSum(a^b,(a&b)<<1);
	}
}
