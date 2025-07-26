/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]*/

import java.util.*;
class TwoSum{
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int left=0;
		for(left=0;left<n;left++){
			for(int right=0;right<n;right++){
				if(nums[left]+nums[right]==target){
					System.out.println(Arrays.toString(new int[]{left,right}));
					return;
				}
			}
		}
		System.out.println(Arrays.toString(new int[]{}));
	}
}		
