package collectionexercise;
import java.util.*;
//code that uses an iterates to print the contents of a collection 
public class E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> it = new HashSet<String>();
		it.add("Shampoo");
		it.add("Soap");
		it.add("Tooth Brush");
		it.add("Face wash");
		Iterator<String> iterator = it.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
