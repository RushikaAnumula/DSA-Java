/*Given an integer array nums, sorted in non-decreasing order, return an array 
of the squares of each number sorted in non-decreasing order.

Sample test case
case=1
input=6
-3 0 1 4 5 7
output=[0, 1, 9, 16, 25, 49]

case=2
input=4
-5 -2 3 6
output=[4, 9, 25, 36] */
import java.util.*;
class Squares{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<num;i++){
      arr[i]=arr[i]*arr[i];
    }
    Arrays.sort(arr);
    for(int i=0;i<num;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
