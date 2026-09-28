import java.util.HashSet;

public class P12 {

	public static void main(String[] args) {
		
		HashSet<String>set=new HashSet<>();
		
		set.add("red");
		set.add("green");
		set.add("black");
		set.add("white");
		
		System.out.println("orignal HashSet Contain :"+set);
		
		set.removeAll(set);
		
		System.out.println("HashSet Contain :"+set);
}
}
