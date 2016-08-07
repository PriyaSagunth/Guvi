
	import java.util.Scanner;
	public class Square4points {
	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int[] a=new int[8];
	        System.out.println("enter your 4 points as (x,y) coordinates");
	        for(int i=0;i<8;i++)
	            a[i]=s.nextInt();
	        if(a[0]==a[2]&&a[4]==a[6]&&a[1]==a[7]&&a[3]==a[5])
	                    System.out.println("this coodinates can form square");
	        else
	            System.out.println("not an square making points");
	    }
	}
