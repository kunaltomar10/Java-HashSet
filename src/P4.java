import java.util.HashSet;

public class P4{

	public static void main(String[] args) {
		
		HashSet<String> set=new  HashSet<>();
		
		set.add("Red");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		set.add("Black");
		set.add("Green");
		
		System.out.println("Orignal Hash Set:"+set);
		
		set.removeAll(set);
		
		System.out.println("Hash Set after removing all the elements"+set);
		
		
	}

}
