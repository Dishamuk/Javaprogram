package patterns;

public class programe05 {
	public static void main(String[]args) {
		for(int a=1;a<=5;a++)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		for (int a=5;a>=1;a--)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
