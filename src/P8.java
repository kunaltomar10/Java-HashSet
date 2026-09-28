import java.util.HashSet;
import java.util.TreeSet;

public class P8 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        set.add("Black");
        set.add("Green");

        System.out.println("Original Hash Set: " + set);
        
        TreeSet<String> st=new TreeSet<>(set);
        
        System.out.println("\nTreeSet elements: ");
        
        for(String colors:st){
        	 System.out.println(colors);
        }
	}

}
