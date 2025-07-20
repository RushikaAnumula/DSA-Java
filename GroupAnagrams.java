/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]*/
import java.util.*;
class GroupAnagrams{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	  String[] strs=sc.nextLine().split(" ");
	  Map<String,List<String>> map=new HashMap<>();
	  for(String s:strs){
      char[] chars=s.toCharArray();
	    Arrays.sort(chars);
	    String key=new String(chars);
	    if(!map.containsKey(key)){
        map.put(key,new ArrayList<>());
	    }
	    map.get(key).add(s);
    }
    List<List<String>> result=new ArrayList<>(map.values());
	  System.out.println(result);
  }
}
