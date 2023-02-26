package StringPractice;

public class PrintnotrepeateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Grate Father";
		
		//char str1[]=string.toCharArray();
		char a = 0;
		char b = 0;
		char s = 0;
		for(int i=0;i<string.length();i++) {
		int count=1;
	for(int j=i+1;j<string.length();j++) {
		if(string.charAt(i)==string.charAt(j)) {
			
count++;
				
			
		}
		
	}
		if(count==1) {
			System.out.print(string.charAt(i));
		}
		
	}
	

		}
		
		
	}


