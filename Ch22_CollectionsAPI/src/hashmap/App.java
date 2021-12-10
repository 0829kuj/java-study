package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// hashmap은 key, value값을 입력한다
		HashMap<Integer, String> people = new HashMap<>();
		
		people.put(0, "펭수");
		people.put(3, "라이언");
		people.put(1, "길동");
		people.put(4, "프레드");
		people.put(4, "마이클");	// key값은 중복불가. 중복값은 업데이트됨
		people.put(10, "수지");
		
		System.out.println(people.get(4));	// key 4에 해당하는 value값을 가져옴
		String person = people.get(10);	// people의 10번 key의 value값을 person에 대입  
		System.out.println(person);	// person출력
		
		people.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();
//		for(String s : people) {}	=> key값으로 value값을 찾으므로 이 방법은 사용불가
	}
}
