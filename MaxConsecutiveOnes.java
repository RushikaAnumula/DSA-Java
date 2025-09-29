/*Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2*/
import java.util.*;
class MaxConsecutiveOnes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print(count(nums));
	}
	public static int count(int[] nums){
		int maxCount=0,count=0;
		for(int num:nums){
			if(num==1){
				count++;
				maxCount=Math.max(maxCount,count);
			}else{
				count=0;
			}
		}
		return maxCount;
	}
}
