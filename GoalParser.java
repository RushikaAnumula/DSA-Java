/*You own a Goal Parser that can interpret a string command. The command consists 
of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret 
"G" as the string "G", 
"()" as the string "o", 
and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.
Sample testcase

case=1
input=G()(al)
output=Goal
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

case=2
input=G()()()()(al)
output=Gooooal*/
import java.util.*;
class GoalParser{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    StringBuilder result=new StringBuilder();
    for(int i=0;i<str.length();){
      if(str.charAt(i)=='G'){
        result.append('G');
        i++;
      }
      else if(str.startsWith("()",i)){
        result.append('o');
        i+=2;
      }
      else if(str.startsWith("(al)",i)){
        result.append("al");
        i+=4;
      }
    }
    System.out.print(result.toString());
  }
}
