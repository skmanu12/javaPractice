package ProgramsOnArray;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] withDuplicates = new String[] { "one", "two", "three", "one","two" };
		
		for (int i = 0; i < withDuplicates.length; i++) {
			for (int j = i + 1; j < withDuplicates.length; j++) {
				if (withDuplicates[i].equals(withDuplicates[j]) ) {
					System.out.println(withDuplicates[i]);
				}
			}
		}

	}

}
