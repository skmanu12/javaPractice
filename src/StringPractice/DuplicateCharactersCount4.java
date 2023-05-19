package StringPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateCharactersCount4 {

	public static void main(String[] args) {
		 String str = "Virtual Interview with Manappa Kalmani".toLowerCase();
	        // int count=1;
	        // Map<Character,Integer> map=new HashMap<Character,Integer>();
	         Map<Character,Integer> map=new HashMap<Character,Integer>();
	        for(int i=0;i<str.length();i++){
	           
	            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
	            ||str.charAt(i)=='o'||str.charAt(i)=='u'){
	               char c=str.charAt(i);
	                if(map.containsKey(str.charAt(i))){
	                    int count=map.get(c);
	                    map.put(c, ++count);
	                   
	                    
	                }else{
	                    map.put(c,1);
	                }
	                
	              
	                
	            }
	            

	}
	        System.out.println(map);
	}
}

