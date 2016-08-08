import java.util.Scanner;
	public class ArrayIndexRepeat {

	

		public static void main(String[] args) {
		 
			   int array[] = new int[10];
			   Scanner s = new Scanner(System.in);
			   System.out.println("Enter the elements : ");
			   for(int i = 0 ;i<array.length;i++){
				   array[i] = s.nextInt();
			   }
			   for(int i : array){
				   if(array[i]==i){
					   System.out.println("the number " + array[i] + " equal to its index " + i);
				   }
			   }
		    s.close();
			}
	}
