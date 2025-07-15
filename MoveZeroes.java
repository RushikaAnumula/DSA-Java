/*Given an integer array nums, move all 0's to the end of it while maintaining 
the  
relative order of the non-zero elements.  
Note that you must do this in-place without making a copy of the array. 
Sample test case 
case=1 
input=5 
0 1 0 3 12 
output=[1, 3, 12, 0, 0] 
case=2 
input=1 
0 
output=[0] using two pointers in java*/
import java.util.*;
class MoveZeroes{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num];
    for(int i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    int index=0;
    for(int i=0;i<num;i++){
      if(arr[i]!=0){
        arr[index]=arr[i];
        index++;
      }
    }
    while(index<num){
      arr[index]=0;
      index++;
    }
    for(int i=0;i<num;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
