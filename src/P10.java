import java.util.HashSet;

public class P10 {

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
		
		System.out.println(set);
		
		System.out.println(set1);
		
		for(String colors :set)
		{
			if(set1.contains(colors))
			{
				System.out.println("Yes");
			}else
			{
				System.out.println("No");
			}
		}
	

	}

}
