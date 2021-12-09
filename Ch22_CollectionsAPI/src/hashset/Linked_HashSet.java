package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		// LinkedHashset은 중복이 안되며 순서대로 출력됨
		LinkedHashSet<String> fruits = new LinkedHashSet<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		
		for(var fruit : fruits) {
			System.out.println(fruit);
		}
		

	}

}
