package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class useHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(1, "Josh");
		map.put(2, "Mike");
		map.put(3, "Fred");
		map.put(4, "Carl");
		map.put(5, "Brad");
		
		System.out.println(map);
		
		System.out.println(map.get("3"));
		
		ArrayList<String> usaCities = new ArrayList<>();
		
		usaCities.add("new york");
		usaCities.add("los angeles");
		usaCities.add("chicago");
		usaCities.add("miami");
		usaCities.add("dallas");
		usaCities.add("new york");
		
		ArrayList<String> englandCities = new ArrayList<>();
		
		englandCities.add("london");
		englandCities.add("manchester");
		englandCities.add("liverpool");
		englandCities.add("leicaster");
		englandCities.add("cambridge");
		englandCities.add("portsmouth");
		
		
		HashMap<String, List<String>> map2 = new HashMap<>();
		map2.put("usa", usaCities);
		map2.put("england", englandCities);
		
		System.out.print(map2);
		

		
		
	}

}
