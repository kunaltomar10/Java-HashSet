import java.util.HashSet;

public class P2 {

	public static void main(String[] args) {
		
		HashSet<String> set=new  HashSet<>();
		
		set.add("Red");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		set.add("Black");
		set.add("Green");
		
		System.out.println("The Hash Set:"+set);
		
		for(String name:set){
			System.out.println(name);
		}
	}

}
