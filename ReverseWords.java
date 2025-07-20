import java.util.*;
class ReverseWords{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    s=s.trim();
	    String words[]=s.split("\\s+");
	    Collections.reverse(Arrays.asList(words));
	    String result=String.join(" ",words);
	    System.out.println(result);
    }
}
