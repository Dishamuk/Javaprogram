package Day08;

public class programe03 {
	public static void main(String[]args) {
		int a=1;
		int b=a++;                                     //post increment
		{
			System.out.println(a + " " + b);
		}
		
		int c=1;
		int d=++c;
		{
			System.out.println( c + " " + d );           //pre increment
		}
				
	}

}
