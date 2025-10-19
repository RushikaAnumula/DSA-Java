/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]*/
import java.util.*;
class FindallNumbersDisappearedInanArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print(findDisappeared(nums));
	}
	public static List<Integer> findDisappeared(int[] nums){
		List<Integer> res=new ArrayList<>();
		Set<Integer> seen=new HashSet<>();
		for(int num:nums) seen.add(num);
		for(int i=1;i<=nums.length;i++){
			if(!seen.contains(i)) res.add(i);
		}
		return res;
	}
}
