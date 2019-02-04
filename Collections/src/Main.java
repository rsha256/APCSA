import java.util.ArrayList;

/* 
 * An ArrayList can hold any type of Object
 * ArrayList can change length while a program is running
 * To use an ArrayList,
 * 1. import it (util)
 * 2. ArrayList<BaseType> list = new ArrayList<BaseType>(length); // length is optional
 * list.add(index, BaseType); // index is optional: list.add(item)
 * list.size(); // rip .length // size is not not capacity
 * .set() is like .add() but replaces it
 * String x = list.get(index);
 * remove() either accepts an index or Object if you give an object it will rm the 1st occurrence of it
 * contains() tells if in the list (true or false)
 * clear() 
 * isEmpty()
 * toArray()
 * clone()
 * equals() same size and contents
 * ArrayList is less efficient
 * ArrayList has to be of an object, not primitive
 * ArrayLists are easier to change size
 * Vector is deprecated Vector
 * autoboxing
 * implements List, extends AbstractList
 * 
 * */

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("yee");
		list.add("yee1");
		list.add("yee2");
		list.add("yee3");
		list.remove(1);
		System.out.println(list);
	}
}
