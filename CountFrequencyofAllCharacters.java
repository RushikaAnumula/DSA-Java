import java.util.*;
class CountFrequencyofAllCharacters{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i),1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			System.out.println("Char:"+entry.getKey()+" Freq:"+entry.getValue());
		}
	}
}
