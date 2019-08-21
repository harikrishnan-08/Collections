import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo1 {
	public static void main(String[] args) {
		List<Integer> value = new ArrayList<>();
		value.add(100);
		value.add(20);
		value.add(3);
		
		Collections.sort(value);                 //to sort without using set class
		
		value.forEach(System.out::println);      //type1

		for (int i : value) {                    //type2
			System.out.println(i);
		}

		System.out.println(value);               //to show as list

		Iterator i = value.iterator();           //type3
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set<Integer> value1=new TreeSet<>();
		value1.add(200);
		value1.add(10);
		value1.add(5);
		for (int j : value1) {                    //using treeto sort
			System.out.println(j);
		}

	}
}
