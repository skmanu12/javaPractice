package ProgramsOnArray;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,0,1};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			//System.out.print(arr[i]);
		}
	System.out.println();
		System.out.print(arr[1]);

	}

}
