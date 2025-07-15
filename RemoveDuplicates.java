/*Given an integer array nums sorted in non-decreasing order, remove the 
duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. 
Then return the number of unique elements in nums.

Sample test case

case=1
input=3
1 1 2
output=2
Explanation: Your function should return 2, with the first two elements of 
input array being 1 and 2 respectively.

case=2
input=10
0 0 1 1 1 2 2 3 3 4
output=5
Explanation: Your function should return 5, with the first five elements of 
input array being 0, 1, 2, 3, and 4 respectively */
import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        for(int right=1;right<num;right++){
            if(arr[right]!=arr[left]){
                left++;
                arr[left]=arr[right];
            }
        }
        System.out.println(left+1);
    }
}
