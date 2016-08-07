

	import java.util.Scanner;
import java.util.Scanner;
public class EvennumIntervals {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the digits : ");
			System.out.println("Enter the Range");
			int n1=s.nextInt();
			int n2=s.nextInt();
			int count=0;
			while(n1<=n2){
				if(n1%2==0){
					System.out.println("The Even Number is : "+n1);
				
					count++;
				}	n1++;
						}
			System.out.println("There are  : "+count+" Even numbers Present in the given range .");

		}
	}


