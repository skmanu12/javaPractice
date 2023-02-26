package Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] array= {"Java","Python","PHP","C++"};
System.out.println(Arrays.toString(array));
List<String> l=new ArrayList<String>();
for(String li:array) {
	l.add(li);
	
}
System.out.print(l);
//Method 2
List<String> arrayList = Arrays.asList(array);
for(String arr:arrayList) {
	System.out.println(arr);
}
	}
	
	

}
