package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="manappa".toLowerCase();
Map<Character,Integer> map=new HashMap<Character,Integer>();
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(map.containsKey(c)) {
		int count=map.get(c);
		map.put(c, ++count);
	}else {
		map.put(c, 1);
	}
}
System.out.println(map);
	}

}
