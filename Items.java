package collectionexercise;

import java.util.Comparator;

//sorting using comparable and comparator
public class Items implements java.lang.Comparable<Items>{
	private String name;
	private int value;
	Items(String name, int value)
	{
		this.name=name;
		this.value=value;
	}	
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name= name;
	}
	int getValue()
	{
		return value;
	}
	void setValue(int value)
	{
		this.value= value;
	}
	public int compareTo(Items compareit) {
        int comparevalue =((Items)compareit).getValue();
        /* For Ascending order*/
        return this.value-comparevalue;
	}
	public int compare(Items i1, Items i2) {
	       return i1.name.compareTo(i2.name);        
		}
	 public static Comparator<Items> Itemname = new Comparator<Items>() {
         @Override
         public int compare(Items o1, Items o2) {
             return o1.name.compareTo(o2.name);
         }
     };
	public String toString() {
        return "[ Value=" + value + ", Name=" + name + "]";
    }

}
