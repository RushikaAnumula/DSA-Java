/*An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
Given an integer array nums, return the number of arithmetic subarrays of nums.
A subarray is a contiguous subsequence of the array.
Example 1:
Input: nums = [1,2,3,4]
Output: 3
Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
Example 2:
Input: nums = [1]
Output: 0*/
import java.util.*;
class ArithmeticSlicesSlidingWindow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print(numberOfArithmeticSlices(nums));
	}
	public static int numberOfArithmeticSlices(int[] nums){
		int n=nums.length;
        if(n<3) return 0;
        int i=0,count=0,curr=0;
        for(int j=2;j<n;j++){
            if(nums[j]-nums[j-1]==nums[j-1]-nums[j-2]){
                curr=curr+1;
                count+=curr;
            }else{
                curr=0;
            }
        }
        return count;
	}
}
