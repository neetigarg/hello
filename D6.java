package collectionexercise;
import java.util.*;
/*a List of Longs. Create an array that “backs” the List.
Change a value in the List and display the contents of the array. Change
a value in the array and display the contents of the List. Attempt to add a
new entry to the List.*/
public class D6 {

	public static void main(String[] args) {
		List<Long> l = new ArrayList<Long>();
		l.add(2421L);
		l.add(3255L);
		l.add(9765L);
		l.add(9786L);
		Long[] l1 = l.toArray(new Long[l.size()]);
		l.set(2, 54665L);
		System.out.println("Displaying array content after changing list value:");
		for(Long m:l1)
		{
			System.out.println(m);
		}
		l1[3]=9086L;
		System.out.println("Changing the value in array and displaying the list:");
		for(Long k:l)
		{
			System.out.println(k);
		}
		System.out.println("Adding the value in the list:");
		l.add(9777L);
		for(Long j:l)
		{
			System.out.println(j);
		}
		/*Long l1[] = new Long[] {1243L,2334L,6789L,1323L,78894L};
		List<Long> l = Arrays.asList(l1);
		System.out.println("Size of list is " +l.size());
		System.out.println("Elements of the list are : ");
		for(Long li : l1)
		{
			System.out.println(+li);
		}
		l.set(2, 54665L);
		System.out.println("Contents of array : ");
		for(int i=0;i<l1.length;i++)
		{
			System.out.println(l1[i]);
		}
		l1[4]=23435L;
		System.out.println("Contents of list are:");
		for(Long lk:l)
		{
			System.out.println(lk);
		}
		System.out.println("After addition of an element in the list :");
		l.add(34675L);
		for(Long lj :l)
		{
			System.out.println(lj);
		}*/
	}

}
