/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step*/
import java.util.*;
class ClimbingStairs{
  public int climbStairs(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int fs = 1, ss = 2;
    for (int i = 3; i <= n; i++) {
      int temp = fs + ss;
      fs = ss;
      ss = temp;
    }
    return ss;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Solution obj = new Solution();
    int result = obj.climbStairs(n);
    System.out.println(result);
  }
}
