/*You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(m * n)) time complexity.
Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false*/
import java.util.*;
class Searcha2DMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] matrix=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		int target=sc.nextInt();
		System.out.print(searchMatrix(matrix,target));
	}
	public static boolean searchMatrix(int[][] matrix,int target){
		if(matrix.length==0 || matrix==null || matrix[0].length==0) return false;
		int m=matrix.length;
		int n=matrix[0].length;
		int row=0,col=n-1;
		while(row<m && col>=0){
			if(matrix[row][col]==target) return true;
			else if(matrix[row][col]>target) col--;
			else row++;
		}
		return false;
	}
}
