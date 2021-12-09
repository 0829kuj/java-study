package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드 : values(), valueOf("상수"), ordinal()
		
		// values() : enum의 모든 상수들을 배열로 리턴
//		Fruit[] fruits = Fruit.values();
//		for (Fruit f : fruits) {
//			System.out.println(f);
//		}
		// 위의 9 ~ 12행을 축약
		for (Fruit f : Fruit.values()) {	// Fruit의 모든 상수들을 배열로 리턴하여 바로 for each문에 사용
			System.out.println(f);
		}
		// ordinal() : enum의 상수의 인덱스 번호(0부터 시작)를 리턴
		System.out.println(Fruit.BANANA.ordinal());		// enum Fruit의 BANANA의 인덱스 번호 출력
		System.out.println(Fruit.MELON.ordinal());
		
		// valueOf("상수값") : 상수값과 같은 enum을 찾아 리턴
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println("f1은 ORANGE와 같은가? " + (f1 == Fruit.ORANGE));
		
		
		// enum switch
		Fruit fruit = Fruit.ORANGE;
		
		switch (fruit) {
		case ORANGE:
			System.out.println("오렌지");
			break;
		case BANANA:
			System.out.println("바나나");
			break;
		case APPlE:
			System.out.println("사과");
			break;
		case MELON:
			System.out.println("멜론");
			break;
		default:
			System.out.println("없는 과일입니다.");
			break;
		}
	}
}
