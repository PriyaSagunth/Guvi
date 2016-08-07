

	import java.util.Scanner;

	public class ArrayRepeating{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no elements of array");
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					System.exit(0);
				}
			}
		}
		
		
	}
	}//2,7,31,44,19,2,33,78,62
