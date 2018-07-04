package collectionexercise;
import java.util.*;
//sorting using comparable by value and using comparator by name
public class A6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Items> arraylist = new ArrayList<Items>();
			System.out.println("Sorting by number");
		   arraylist.add(new Items("Shampoo",101));
		   arraylist.add(new Items("Tooth Brush", 3));
		   arraylist.add(new Items("Soap", 2));

		   Collections.sort(arraylist);
		   for(Items it: arraylist){
				System.out.println(it);
		   }
		   System.out.println("Sorting by name");
		   Collections.sort(arraylist,Items.Itemname);
		   for(Items ite: arraylist){
				System.out.println(ite);
		   }
		   
	}

}
