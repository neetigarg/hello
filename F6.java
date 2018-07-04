package collectionexercise;

import java.util.*;

public class F6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Items> s = new HashSet<Items>();
		s.add(new Items("Shampoo",1));
		s.add(new Items("ToothBrush",2));
		s.add(new Items("ToothBrush",2));
		s.add(new Items("Soap",3));
		//s.add("String");
		for(Items it:s)
		{
			System.out.println(" "+it);
		}
	}

}
