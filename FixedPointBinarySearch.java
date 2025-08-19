/*Given an array of distinct integers arr, where arr is sorted in ascending order, return the smallest index i that satisfies arr[i]==i. If there is no such index, return -1.
Example 1:
Input: arr = [- 10, - 5, 0, 3, 7]
Output: 3
Explanation: For the given array, arr[0]=-10, arr[1]=-5,arr[2]=0,arr[3]=3, thus the output is 3.
Example 2:
Input: arr = [0, 2, 5, 8, 17]
Output:
Explanation: arr[0] = 0, thus the output is 0.
Example 3:
Input: r = [-10, -5, 3, 4, 7, 9]
Output: -1
Explanation: There is no such i that arr[i]==i, thus the output is -1.*/
import java.util.*;
class FixedPointBinarySearch{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print(fixedpoint(arr,n));
  }
  public static int fixedpoint(int arr[],int n){
    int left=0,right=n-1,result=-1;
    while(left<=right){
	    int mid=left+(right-left)/2;
      if(arr[mid]==mid){
        result=mid;
        right=mid-1;//search for smaller index on the left by moving right
      }
      else if(arr[mid]<mid){
        left=mid+1;//search in right half of the array
      }
      else right=mid-1;//search in left half of the array
    }
    return result;
  }
}
