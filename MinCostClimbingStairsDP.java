/*You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.*/
import java.util.*;
class MinCostClimbingStairsDP{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] cost=new int[n];
		for(int i=0;i<n;i++){
			cost[i]=sc.nextInt();
		}
		System.out.print(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost){
		int n=cost.length;
		int prev2=cost[0],prev1=cost[1];
		for(int i=2;i<n;i++){
			int curr=cost[i]+Math.min(prev1,prev2);
			prev2=prev1;
			prev1=curr;
		}
		return Math.min(prev1,prev2);
	}
}
