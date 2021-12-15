package lamda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		// 문자열 array list 생성
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		list.forEach(new Consumer<String>() {
		// Consumer 인터페이스(추상 메서드)를 익명 클래스에서 구현해야 함
			@Override
			public void accept(String t) {
				// 익명 클래스에서 구현
				System.out.print(t + "\t");
			}
		});
		System.out.println();
		
		// 익명 클래스를 람다식으로 변경
		list.forEach(t -> System.out.print(t + "\t"));
	}

}
