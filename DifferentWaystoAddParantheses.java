/*Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order.
The test cases are generated such that the output values fit in a 32-bit integer and the number of different results does not exceed 104.
Example 1:
Input: expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2
Example 2:
Input: expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]
Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10*/
import java.util.*;
class DifferentWaystoAddParantheses{
    public List<Integer> compute(String expr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                List<Integer> left = compute(expr.substring(0, i));
                List<Integer> right = compute(expr.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        int res = 0;
                        if (ch == '+') res = l + r;
                        else if (ch == '-') res = l - r;
                        else if (ch == '*') res = l * r;
                        result.add(res);
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expr));
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DifferentWaystoAddParantheses t = new DifferentWaystoAddParantheses();
        String input = sc.nextLine();
        List<Integer> results = t.compute(input);
        System.out.print(results);
    }
}
