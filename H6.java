package collectionexercise;
//non generic 
import java.util.*;
public class H6 {
	public static void main(String[] args)
	{
		List l = new ArrayList();
		l.add(3435l);
		l.add(3425l);
		l.add(34181l);
		l.add(978996l);
		Iterator iterator = l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}
}
