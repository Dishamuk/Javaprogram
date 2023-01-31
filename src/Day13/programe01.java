package Day13;

import java.util.ArrayList;

public class programe01 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> x= new ArrayList<>();
		x.add(10);//0
		x.add(20);//1
		x.add(30);//2
		System.out.println(x);
		x.remove(0);
		System.out.println(x);
		x.add(10);
		System.out.println(x);
		x.add(2, 10);
		System.out.println(x);
		System.out.println(x.size());
		System.out.println(x.contains(20));
		System.out.println(x.contains(200));
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		
	}
}
