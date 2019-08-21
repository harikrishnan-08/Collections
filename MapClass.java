import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
	public static void main(String[] args) {
		Map <String , String> values=new HashMap<>();
		values.put("name", "ambani");
		values.put("clg","anna");
		values.put("branch","S/W");
		
//		System.out.println(values);
//		System.out.println(values.get("clg"));
		
		Set <String> key=values.keySet();
		for(String i : key) {
			System.out.println(i +":"+ values.get(i));
			
		}
		Set<Map.Entry<String,String>> obj=values.entrySet();
		for(Map.Entry<String, String> e:obj) {
			System.out.println(e.getKey()+":"+e.getValue());
			e.setValue("III");
		}
	}

}
