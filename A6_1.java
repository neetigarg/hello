package collectionexercise;
import java.util.*;
//class that guarantees no duplicates
class A6_1{
	public static void main(String[] args) {
	Set<Items> s = new LinkedHashSet<Items>();
	Items i1 = new Items("Shampoo",1);
	Items i2 = new Items("Soap",4);
	Items i3 = new Items("Face Wash",3);
	Items i4 = new Items("Face Powder",2);
	s.add(i1);
	s.add(i2);
	s.add(i3);
	s.add(i4);
	s.add(i3);
    	Iterator<Items> i  = s.iterator();
    	while (i.hasNext()) {
        	Items string = (Items) i.next();
        	System.out.println(string);
    	}
	}
}