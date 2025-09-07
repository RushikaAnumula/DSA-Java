/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2*/
import java.util.*;
class MajorityElementBoyerMoore{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
  	int nums[]=new int[n];
  	for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
  	}
  	int count=0,element=0;
  	for(int num:nums){
      if(count==0){
        element=num;
  	  }
  	  if(num==element){
        count++;
  	  }
	    else{
        count--;
	    }
    }
    System.out.println(element);
  }
}
