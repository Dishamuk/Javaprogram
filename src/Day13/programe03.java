package Day13;                //collections


	import java.util.HashMap;

	public class programe03 {

		public static void main(String[] args) {
			HashMap<Integer,String> x= new HashMap<>();
			x.put(101, "aa");
			x.put(102, "bb");
			x.put(101, "aaa");
			x.put(103, "bb");
			x.put(null, null);      ///null means we can add empty, null can be in hashmap not in hashtable
			System.out.println(x);
			x.remove(101);
			System.out.println(x);
			x.remove(102, "bb");
			System.out.println(x);
			System.out.println(x.size());
			x.put(101, "aa");
			x.put(102, "bb");		
			System.out.println(x);		
			System.out.println(x.keySet());
			System.out.println(x.values());
			System.out.println(x.entrySet());
			x.replace(102, "aaa");
			x.put(104, "aaa");//replace and new key
			System.out.println(x);

}
	}
	
