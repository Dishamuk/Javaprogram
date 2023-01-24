package Day09;

import java.util.Scanner;

public class programe02 {
	public static void main(String[]args) {
		forloop();

}
	public static void dowhile() {
Scanner input = new Scanner(System.in);
System.out.println("Enter table value");
int table =input.nextInt();
input.close();
int a=1;
do {
	System.out.println( a +"x"+ table +"="+ a*table);
	a++;
}
while(a<=10);
}



public static void forloop() {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter table value");
	int table=input.nextInt();
		input.close();	
	for(int a=1;a<=10;a++)
	{
		System.out.println(a +"x"+ table +"="+ a*table);
	}
}
	
}
  
