import java.util.HashSet;

public class P11 {

	public static void main(String[] args) {
		
		HashSet<String>set=new HashSet<>();
		
		set.add("red");
		set.add("green");
		set.add("black");
		set.add("white");
		
		HashSet<String>set1=new HashSet<>();
		
		set1.add("red");
		set1.add("pink");
		set1.add("black");
		set1.add("orange");
		
		System.out.println("First HashSet Contain :"+set);
		
		System.out.println("Second HashSet Contain :"+set1);
		
		System.out.println("\n HashSet Contain :");
		
		set.retainAll(set1);
		
		System.out.println(set);
	
		
		

	}

}
