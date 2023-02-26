package Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method1
String[] array= {"Java","Python","PHP","C++"};
List<String> list = Arrays.asList(array);
for(String arr:list) {
	System.out.println(arr);
}

//Method 2
List<String> li=new ArrayList<String>();
for(String ar:array) {
	 li.add(ar);
	
}
System.out.print(li.toString());
	}
	
	

}
