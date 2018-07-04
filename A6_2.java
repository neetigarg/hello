package collectionexercise;
import java.util.*;
//a class that makes a collection of Items that can be accessed in
//the order in which they were added to the collection.linkedhashset,linked hash map iterates by insertion order
public class A6_2 {
	public static void main(String[] args)
	{
		Set<Items> it = new LinkedHashSet<Items>();
		it.add(new Items("Shampoo",5));
		it.add(new Items("Soap",2));
		it.add(new Items("Tooth Brush",7));
		it.add(new Items("Face Wash",4));
		Iterator<Items> i = it.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
