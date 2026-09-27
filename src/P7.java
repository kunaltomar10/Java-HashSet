import java.util.HashSet;
import java.util.Arrays;

public class P7 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        set.add("Black");
        set.add("Green");

        System.out.println("Original Hash Set: " + set);

        // Convert HashSet to array
        String[] array = set.toArray(new String[0]);

        System.out.println("Array elements: ");

        for (String color : array) {
            System.out.println(color);
        }
    }
}
