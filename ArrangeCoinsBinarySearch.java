/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
Example 1:
Input: n = 5
Output: 2
Example 2:
Input: n = 8
Output: 3*/
import java.util.*;
class ArrangeCoinsBinarySearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long left=0,right=n;
		while(left<=right){
			long mid=left+(right-left)/2;
			long coins=mid*(mid+1)/2;
			if(coins==n){
				System.out.print((int)mid);
			}
			else if(coins<n){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		System.out.print((int)right);
	}
}
