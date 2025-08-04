/*The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:
Input: n = 25
Output: 1389537*/
import java.util.*;
class Tribonacci{
	public static int trib(int n){
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		int firstnum=0,secondnum=1,thirdnum=1,temp;
		for(int i=3;i<=n;i++){
			temp=firstnum+secondnum+thirdnum;
			firstnum=secondnum;
			secondnum=thirdnum;
			thirdnum=temp;
		}
		return thirdnum;
	}
	public static void main(String[] args){
		Tribonacci t=new Tribonacci();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=t.trib(n);
		System.out.println(res);
	}
}
