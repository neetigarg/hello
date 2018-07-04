package collectionexercise;

import java.util.ArrayList;
import java.util.List;

public class A6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Items> l = new ArrayList<Items>();
		Items i1 =new Items("Shampoo",1); 
		Items i2=new Items("Soap", 2);
		Items i3=new Items("Talcum powder",3);
		Items i4=new Items("Face Wash",4);
		l.add(i1);
		l.add(i2);
		l.add(i3);
		l.add(i4);
		String buyer[] = new String[l.size()];
		int index = 0;
		for (Object value : l) {
		  buyer[index] = String.valueOf( value );//string array contains string object
		  System.out.println(" "+buyer[index]);
		  index++;
		}
	}

}
