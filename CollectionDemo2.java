import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
		public static void main(String[] args) {
			List<Integer> value = new ArrayList<>();
			value.add(109);
			value.add(20);
			value.add(3888);
			
			Collections.sort(value,(o1,o2)->{
				return o1%10>o2%10?1:-1;
			}
			);
			for(int i : value)
			{
				System.out.println(i);
			}

}
}