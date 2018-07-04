package collectionexercise;
/*an array of Strings and use method(s) in the Arrays class
to search the array for the location of specific Strings. Demonstrate an
unsuccessful search. Next, sort the array in reverse order and perform another
search.*/
import java.util.*;
public class B6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[4];
		String s;
		int i;
		arr[0]="Jeffrey";
		arr[1]="Ruskin";
		arr[2]="Thomas";
		arr[3]="Agatha";
		/*Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be searched");
		String s = in.nextLine();*/
		s ="Thomas";
		for(i=0;i<arr.length;i++)
		{
				if(arr[i].equals(s))
				{
					System.out.println("Found at index number " +i);
					
					break;
				}
				else
					System.out.println("Not found at "+i+ " index");
			}
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("String Array Elements in reverse order:");
    	for(i = 0; i < arr.length; i++)
    		System.out.println(arr[i]);
    	System.out.println("Searching the string:");
    	for(i=0;i<arr.length;i++)
		{
				if(arr[i].equals(s))
				{
					System.out.println("Found at index number " +i+" position is "+(i+1));
					
					break;
				}
				else
					System.out.println("Not found at "+i+ " index");
			}
    	
	}
}
