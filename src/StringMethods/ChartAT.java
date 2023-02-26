package StringMethods;

public class ChartAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to Javatpoint porta";
System.out.println(str.charAt(str.length()-1));
for(int i=0;i<str.length();i++) {
	if(i%2!=0) {
		System.out.println("Cahr at Odd place: "+i+" "+str.charAt(i));
}
	
	}
for(int i=0;i<str.length();i++) {

	if(i%2==0) {
		System.out.println("Char at Even place: "+i+" "+str.charAt(i));
}
	}

}
}
