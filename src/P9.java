import java.util.HashSet;
import java.util.ArrayList;

public class P9 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        set.add("Black");
        set.add("Green");

        System.out.println("Original Hash Set: " + set);
        
        ArrayList list=new ArrayList<>(set);
        
        System.out.println("\nArrayList contains: "+list);
        
	}

}
