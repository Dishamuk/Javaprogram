package patterns;

public class programe04 {
	public static void main(String[]args) {
		int a=1;
		do {
			int b=1;
			do {
				System.out.print(a);
				b++;
			}while(b<=a);
			System.out.println();
			a++;
		}while(a<=5);
	}

}
