import java.util.HashSet;

public class P5{

	public static void main(String[] args) {
		
		HashSet<String> set=new  HashSet<>();
		
		set.add("Red");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		set.add("Black");
		set.add("Green");
		
		System.out.println("Orignal Hash Set:"+set);
		
		System.out.println("Checking the above array list is empty or not!"+set.isEmpty());
		
		set.removeAll(set);
		
		System.out.println("\nRemove all the elements from a Hash Set:");
		
		System.out.println("Hash Set after removing all the elements"+set);

	}

}
