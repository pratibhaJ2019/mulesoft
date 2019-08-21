import java.util.Map;

public class LoopMap {

	public String loopMap(Map<?, ?> map) {
		String output = "";
		for (Map.Entry<?, ?> entry : map.entrySet()) {
			//System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			output = output + entry.getKey() + ": " + entry.getValue() + "\n";
		}
		return output;
	}
}
