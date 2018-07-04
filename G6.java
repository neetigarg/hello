package collectionexercise;
import java.util.*;
class G6
{
	public static void main(String[] args)
	{
		Map<String,Items> m = new HashMap<String,Items>();
		m.put("Soap", new Items("Soap",3));
		m.put("Shampoo", new Items("Shampoo",2));
		m.put("Face Wash", new Items("Face Wash",1));
		m.put("Tooth Brush", new Items("Tooth Brush",4));
		System.out.println(m.get("Soap"));
		System.out.println(m.get("Talcom powder"));
		//System.out.println(m.get(new Items("Shampoo",2)));
	}
}