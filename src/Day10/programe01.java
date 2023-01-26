package Day10;              //fibonacci series 0,1,1,2,3,5(sum of last 2 digits)

public class programe01 {
	public static void main(String[]args) {
		int x=0;
		int y=1;
		
		int a=1;
		while(a<=10)
		{
			System.out.println(x);
			int z=x+y;
			x=y;
			y=z;
			a++;
		}
	}

}
