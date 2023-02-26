package Basic1;

public class split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manappa is Manappa Money Minded";
		String[] words = str.toLowerCase().split(" ");
		for(String w:words) {
			if(w.charAt(0)=='m') {
				System.out.println(w);
			}
			
		}
		for(int i=0;i<words.length;i++) {
			if(words[i].charAt(0)=='m') {
				System.out.println(words[i]);
			}
			
		}

	}

}
