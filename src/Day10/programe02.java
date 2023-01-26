package Day10;

public class programe02 {
	public static void main(String[]args) {
		int x=0;
		int y=1;
		int a=1;
		do {
			System.out.println(x);
			int z=x+y;
			x=y;
			y=z;
			a++;
		}
		while(a<=11);
	}

}
