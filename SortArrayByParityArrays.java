/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.
Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:
Input: nums = [0]
Output: [0]
Constraints:
1 <= nums.length <= 5000
0 <= nums[i] <= 5000*/
import java.util.*;
class SortArrayByParityArrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print(Arrays.toString(sortArrayByParity(nums)));
	}
	public static int[] sortArrayByParity(int[] nums){
		int res[]= new int[nums.length];
        int idx=0;
        for(int num:nums){
            if(num%2==0){
                res[idx++]=num;
            }
        }
        for(int num:nums){
            if(num%2!=0){
                res[idx++]=num;
            }
        }
        return res;
	}
}
