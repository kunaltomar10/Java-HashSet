import java.util.HashSet;

public class P3{

	public static void main(String[] args) {
		
		HashSet<String> set=new  HashSet<>();
		
		set.add("Red");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		set.add("Black");
		set.add("Green");
		
		System.out.println("Orignal Hash Set:"+set);
		
		System.out.println("Size of the Hash :"+set.size());
	}

}
