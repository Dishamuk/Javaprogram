package Day09;

public class factorialcode {
	public static void main(String[]args) {
		
		whileLoop();
		
	}
	

		public static void whileLoop()
		{
			int fact=8;
			int x=1;
			long temp=1;
			while(x<=fact)
			{
				temp=temp*x;			
				x++;
			}
			System.out.println(fact+"   "+temp);
			
		}
}