package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// Map 정렬
		// HashSet(순서없음), LinkedHashSet(순서있음-입력순서대로), TreeSet(정렬)
		
		// LinkedHashMap은 입력한 순서대로 정렬됨
		Map<Integer, String> months1 = new LinkedHashMap<>();
		months1.put(1, "1월");
		months1.put(6, "6월");
		months1.put(3, "3월");
		
		months1.forEach((k, v)-> System.out.println(k + ": " + v));
		System.out.println();
		
		// TreeMap은 key값을 기준으로 정렬됨
		Map<Integer, String> months2 = new TreeMap<>();
		months2.put(3, "3월");
		months2.put(6, "6월");
		months2.put(1, "1월");
		months2.forEach((k, v)-> System.out.println(k + ": " + v));
	}

}
