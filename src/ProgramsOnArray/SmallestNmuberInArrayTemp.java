package ProgramsOnArray;

public class SmallestNmuberInArrayTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,2,1,4,5};
int temp;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;			
		}
	}
	
}
System.out.print(arr[0]);
	}

}
