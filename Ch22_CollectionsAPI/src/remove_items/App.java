package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class App {
	public static void main(String[] args) {
		// 리스트의 아이템 제거하기
		// remove(인덱스번호 | 객체주소) : 해당 인덱스번호 혹은 객체가 삭제됨
		Cat c1 = new Cat("마틸다");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		
//		cats.remove(1);		// 인덱스 번호 => index 1번인 라이언이 삭제됨
		cats.remove(c1);	// 객체 주소 => 주소에 저장된 아이템인 마틸다가 삭제됨
		
		cats.forEach(System.out::println);
	}

}
