package Day12;

public class programe04 {
	public static void main(String[] args) {
		int n=6;
		
		boolean x=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				x=false;
				break;
			}
		}
		if(x)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}


