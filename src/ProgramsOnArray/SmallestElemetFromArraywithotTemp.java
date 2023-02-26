package ProgramsOnArray;

public class SmallestElemetFromArraywithotTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,4,1};
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
}
System.out.print(min);
	}

}
