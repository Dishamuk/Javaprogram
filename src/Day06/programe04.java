package Day06;

import java.util.Scanner;

public class programe04 {
	public static void main(String[]args) {
		Scanner x= new Scanner(System.in);   // scanner is used to give input during runtime in console itself
		System.out.println("Enter value a");
		int a=x.nextInt();
		System.out.println("Enter value b");
		int b=x.nextInt();
		x.close();
		
		if(a>b)
			System.out.println("a is greater");
		else if(b>a)
			System.out.println("b is greater");
		else if(a==b)
			System.out.println("equal");
	}

}
