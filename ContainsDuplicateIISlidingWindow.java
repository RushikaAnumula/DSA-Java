/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105*/
import java.util.*;
class ContainsDuplicateIISlidingWindow{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.print(containsNearbyDuplicate(nums,k));
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k){
		int i=0;
		HashSet<Integer> set=new HashSet<>();
		for(int j=0;j<nums.length;j++){
			if(j-i>k){
				set.remove(nums[i]);
				i++;
			}
			if(set.contains(nums[j])) return true;
			set.add(nums[j]);
		}
		return false;
	}
}
		
