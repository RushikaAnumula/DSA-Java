/*You are given a 0-indexed integer array nums of length n.
A subarray is a contiguous non-empty sequence of elements within the array.
For any selected subarray, its interesting sum is calculated as follows:
The first element is added.
The second element is subtracted.
The third element is added.
The fourth element is subtracted.
And so on…
In other words, for a subarray starting at index i and ending at index j:
nums[i]−nums[i+1]+nums[i+2]−nums[i+3]+…
Your task is to return the maximum interesting sum among all possible subarrays.
input:
An integer n — the size of the array.
An array nums of n integers.
output:
Print a single integer — the maximum interesting sum.
Input:
5
-1 2 -1 4 7
Output:
7
Explanation:
The subarray [2, -1, 4] gives: +2 -(-1) +4 = 7
This is the maximum possible interesting sum.
Let’s evaluate all possible subarrays of:
[-1, 2, -1, 4, 7]
Rule:
For every chosen subarray, signs always start with +
Pattern:
For a subarray starting at index i:
+nums[i] − nums[i+1] + nums[i+2] − nums[i+3] …
This removes any confusion about indexing.
Step 1: Subarrays starting at index 0
[-1]		isum  +(-1) = -1
[-1, 2]		isum  -1 - 2 = -3
[-1, 2, -1]     isum  -1 - 2 + (-1) = -4
[-1, 2, -1, 4]  isum  -1 - 2 + (-1) - 4 = -8
[-1, 2, -1, 4, 7] isum -1 - 2 + (-1) - 4 + 7 = -1
Maximum from this group = -1
Subarrays starting at index 1
[2]			isum  +2 = 2
[2, -1]			isum  2 - (-1) = 3
[2, -1, 4]		isum  2 - (-1) + 4 = 7
[2, -1, 4, 7]		isum  2 - (-1) + 4 - 7 = 0
Maximum from this group = 7
Subarrays starting at index 2
[-1]              isum -1
[-1, 4]		  isum -1 - 4 = -5
[-1, 4, 7]        isum -1 - 4 + 7 = 2
Maximum from this group = 2
Subarrays starting at index 3
[4]		  isum 4
[4, 7]		  isum 4 - 7 = -3
Maximum from this group = 4
Subarrays starting at index 4
[7]		isum  7
Maximum from this group = 7
Two subarrays give 7:
[2, -1, 4]
[7]
Because:
It produces the highest alternating sum = 7
It leverages the pattern: +2 -(-1) +4
The negative number -1 becomes positive after subtraction
this increases the total
case = 1
input =5
-1 2 -1 4 7
output =7

case = 2
input =1
5
output =5

case = 3
input =1
-5
output =-5

case = 4
input =4
3 -1 1 2
output =5

case = 5
input =4
1 2 3 4
output =4

case = 6
input =3
-1 -2 -3
output =-1

case = 7
input =5
100 -100 100 -100 100
output =500

case = 8
input =6
2 -3 4 -5 6 -7
output =27*/
import java.util.*;
class MaximumIntrestingSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        long add=nums[0];
        long sub=0;
        long ans=nums[0];
        for (int i=1;i<n;i++){
            long newAdd=Math.max(nums[i],sub+nums[i]);
            long newSub=add-nums[i];
            add=newAdd;
            sub=newSub;
            ans=Math.max(ans,Math.max(add,sub));
        }
        System.out.print(ans);
    }
}
