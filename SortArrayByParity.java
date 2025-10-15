/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]*/
import java.util.*;
class SortArrayByParity{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		List<Integer> evens=new ArrayList<>();
		List<Integer> odds=new ArrayList<>();
		for(int num:nums){
			if(num%2==0) evens.add(num);
			else odds.add(num);
		}
		evens.addAll(odds);
		for(int e:evens){
			System.out.print(e+" ");
		}
	}
}
