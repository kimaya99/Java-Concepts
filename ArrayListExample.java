import java.util.*;

class ArrayListExample {
	public static void main (String args[]){
		ArrayList <String> a = new ArrayList<String> ();
		a.add("Hello");  // adding element
		a.add(0,"World"); // adding at a particular index
        System.out.println(a);
		a.remove("Hello");  // removing element
		a.add(1,"Pole");
		a.add(2,"Home");
        a.set(1,"Kimaya");
		System.out.println(a);
        a.add(1,"Heaven");    // add vs set
        System.out.println(a); // set replaces at a particular index
        System.out.println(a.get(2)); // fetching element
        System.out.println(a.size()); // size of array
	}
}
