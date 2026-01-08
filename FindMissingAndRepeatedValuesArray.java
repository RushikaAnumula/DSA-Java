/*You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.
Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
Example 1:
Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
Example 2:
Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].*/
import java.util.*;
class FindMissingAndRepeatedValuesArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] grid=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				grid[i][j]=sc.nextInt();
			}
		}
		System.out.print(Arrays.toString(findMissingAndRepeatedValues(grid)));
	}
	public static int[] findMissingAndRepeatedValues(int[][] grid){
		int n=grid.length;
		int size=n*n;
		int[] freq=new int[size+1];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				freq[grid[i][j]]++;
			}
		}
		int repeated=-1, missing=-1;
		for(int i=1;i<=n*n;i++){
			if(freq[i]==2) repeated=i;
			if(freq[i]==0) missing=i;
		}
		return new int[]{repeated,missing};
	}
}
