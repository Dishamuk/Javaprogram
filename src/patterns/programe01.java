package patterns;

public class programe01 {
	public static void main(String[]args)
	{
		int a =1;
		do {
			int b=5;
			do {
				System.out.print(b);
				b--;
			}while(b>=a);
			System.out.println();
			a++;
			
		}while(a<=5);
	}
}
