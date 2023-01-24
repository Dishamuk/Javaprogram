package Day09;

import java.util.Scanner;

public class programe01 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter table value");
		int table = input.nextInt();
		input.close();
		int a=1;
		while(a<=10)
		{
			System.out.println(a+ "x"+ table +" = "+ table*a);
			a++;
		}
		
	}
}
	
	