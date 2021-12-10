package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Iterating_Map {

	public static void main(String[] args) {
		// map타입을 반복문으로 출력하기
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		// 1. 람다식으로 출력
		months.forEach((k, v)-> System.out.println(k + ": " + v));
		System.out.println();
		
		// 2. entrySet() : key와 value값을 가져옴
		for(var entry : months.entrySet()) {
		// ㄴvar는 원래 형타입인 Map.Entry<String, String>를 써줘야하지만 자동으로 형타입을 지정해주는 var로 선언
		// ㄴJDK 10버전부터 사용가능
			String k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		// 3. keySet() : key값을 가져옴
		for(var k : months.keySet()) {	// key값만 가져옴
			String v = months.get(k);		// 가져온 key값을 이용해 value값도 가져옴
			System.out.println(k + ": " + v);	// 순서가 없으므로 뒤죽박죽 출력됨
		}
		
	}

}
