package Day10;

public class programe03 {
	
public static void main(String[]args) {
	int x=1;
	int y=2;
	for(int a=1;a<=10;a++) {
		System.out.println(x);
		int z=x+y;
		x=y;
		y=z;
	}
	}
}