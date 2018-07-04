package collectionexercise;
import java.util.*;
public class C6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = new ArrayList<String>();
		s.add("Thomas");
		s.add("Hardy");
		s.add("Agatha");
		s.add("Jeffrey");
		s.add("Ruskin");
		Collections.sort(s);
		for(String t:s) {
			System.out.println(" "+t);
		}
		System.out.println("Searching for the String "+Collections.binarySearch(s, "Hardy"));
	
	}

}
