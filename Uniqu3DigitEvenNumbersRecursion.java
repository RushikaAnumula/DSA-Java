/*You are given an array of digits called digits. Your task is to determine the number of distinct three-digit even numbers that can be formed using these digits.
Note: Each copy of a digit can only be used once per number, and there may not be leading zeros.
Example 1:
Input: digits = [1,2,3,4]
Output: 12
Explanation: The 12 distinct 3-digit even numbers that can be formed are 124, 132, 134, 142, 214, 234, 312, 314, 324, 342, 412, and 432. Note that 222 cannot be formed because there is only 1 copy of the digit 2.
Example 2:
Input: digits = [0,2,2]
Output: 2
Explanation: The only 3-digit even numbers that can be formed are 202 and 220. Note that the digit 2 can be used twice because it appears twice in the array.
Example 3:
Input: digits = [6,6,6]
Output: 1
Explanation: Only 666 can be formed.
Example 4:
Input: digits = [1,3,5]
Output: 0
Explanation: No even 3-digit numbers can be formed.
Constraints:
3 <= digits.length <= 10
0 <= digits[i] <= 9*/
import java.util.*;
class Uniqu3DigitEvenNumbersRecursion{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] digits=new int[n];
		for(int i=0;i<n;i++){
			digits[i]=sc.nextInt();
		}
		System.out.print(totalNumbers(digits));
	}
	public static int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        boolean[] used=new boolean[digits.length];
        solve(digits,used,0,0,set);
        return set.size();
    }
    public static void solve(int[] digits, boolean[] used,int num, int len,Set<Integer> set){
        if(len==3){
            if(num>=100 && num%2==0){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]) continue;
            if(len==0 && digits[i]==0) continue;
            used[i]=true;
            solve(digits,used,num*10+digits[i],len+1,set);
            used[i]=false;
        }
    }
}
