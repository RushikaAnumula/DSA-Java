/*You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:
Input: nums = [5], k = 1
Output: 5.00000
Constraints:
n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104*/
import java.util.*;
class MaximumAverageSubarrayISlidingWindow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.print(findMaxAverage(nums,n,k));
	}
	public static double findMaxAverage(int[] nums,int n,int k){
		int n=nums.length;
		int sum=0;
		for(int i=0;i<k;i++){
			sum+=nums[i];
		}
		double maxAvg=(double)sum/k;
		for(int i=k;i<n;i++){
			sum+=nums[i]-nums[i-k];
			double avg=(double)sum/k;
			if(avg>maxAvg){
				maxAvg=avg;
			}
		}
		return maxAvg;
	}
}
	
