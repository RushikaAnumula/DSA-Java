/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order*/
import java.util.*;
class SquaresofaSortedArrayTwoPointer{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    System.out.print(Arrays.toString(sortedSquares(nums)));
  }
  public static int[] sortedSquares(int[] nums){
    int n=nums.length;
    int res[]=new int[n];
    int i=0,j=n-1;index=n-1;
    while(i<=j){
      if(Math.abs(nums[i])>Math.abs(nums[j])){
        res[index]=nums[i]*nums[i];
        i++;
      }else{
        res[index]=nums[j]*nums[j];
        j--;
      }
      index--;
    }
    return res;
  }
}
