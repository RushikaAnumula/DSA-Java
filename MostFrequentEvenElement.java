/*Given an integer array nums, return the most frequent even element.
If there is a tie, return the smallest one. If there is no such element, return -1.
Example 1:
Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
Example 2:
Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.
Example 3:
Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.*/
import java.util.*;
class MostFrequentEvenElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		System.out.print(mostFreqEven(nums));
	}
	public static int mostFreqEven(int[] nums){
		HashMap<Integer,Integer> map=new HashMap<>();
		int maxFreq=0,res=-1;
		for(int num:nums){
			if(num%2==0){
				if(map.containsKey(num)){
					map.put(num,map.get(num)+1);
				}else{
					map.put(num,1);
				}
				int freq=map.get(num);
				if(freq>maxFreq || (freq==maxFreq && num<res)){
					maxFreq=freq;
					res=num;
				}
			}
		}
		return res;
	}
}
