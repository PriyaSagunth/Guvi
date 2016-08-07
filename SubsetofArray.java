import java.util.Scanner;
public class SubsetofArray {

public static void ijkProblem(int[] arr,int[] arr1){
	int count=0;
 for(int i=0;i<arr.length;i++){
	 count=0;
	 for(int j=0;j<arr1.length;j++){
		 if(arr[i]==arr1[j])
		 {
			 count++;
		 }
		 
	 }
	 if(count==0){
		 System.out.println("Not a Subset");
		 System.exit(0);
	 }
 }
 System.out.println("Array1 is Subset of Array2");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter Array1 length");
		int len=scr.nextInt();
		System.out.println("Enter Array2 length");
		int len2=scr.nextInt();
		int[] arr=new int[len];
		int[] arr1=new int[len2];
		System.out.println("Enter Array1 Elements");
		for(int i=0;i<len;i++){
			arr[i]=scr.nextInt();
		}
		System.out.println("Enter Array2 Elements");
		for(int i=0;i<len2;i++){
			arr1[i]=scr.nextInt();
		}
		ijkProblem(arr,arr1);
		scr.close();

	}

}

