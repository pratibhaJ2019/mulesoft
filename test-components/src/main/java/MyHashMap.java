import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	Map<String, String> hashMap = new HashMap<String, String>();

	public MyHashMap() {

	}

	public Map<String, String> hashMap(String id, String value) {

		System.out.println("2: " + value);
		String currentValue = hashMap.get(id);

		if (hashMap.get(id) == null)
			hashMap.put(id, value);
		else if (currentValue.compareTo(value) < 0)
			hashMap.put(id, value);
		return hashMap;
	}
}
