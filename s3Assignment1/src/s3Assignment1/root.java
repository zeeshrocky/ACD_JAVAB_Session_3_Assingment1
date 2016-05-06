package s3Assignment1;

import java.util.Scanner;

public class root {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Value to find its Square Root: ");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		System.out.println("Square Root of the Entered Value is: "+Math.sqrt(x));
		
		
		System.out.println("Enter the Value to find its Cube Root: ");
		Scanner inp=new Scanner(System.in);
		int y=inp.nextInt();
		System.out.println("Cube Root of the Entered Value is: "+Math.cbrt(y));
	}

}
