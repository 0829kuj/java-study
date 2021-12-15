package lamda;

public class App {

	public static void main(String[] args) {
		Human tom = new Human();
//		tom.walk();
		walking(tom);
		
		Robot sam = new Robot();
//		sam.walk();
		walking(sam);	
			// 아래 만들어둔 메소드 Walking은 Human타입 객체를 입력해야하므로 로봇 샘은 입력불가
		
		walking(new Walkable() {
			@Override
			public void walk() {
				System.out.println("이름없는 클래스 객체가 걷는다...");
			}
		});
		walking(() -> System.out.println("이름없는 클래스 객체가 걷는다...?"));
		walking(() -> {
			System.out.println("두 줄 이상일 땐 중괄호 필요");
			System.out.println("이름없는 클래스 객체가 걷는다!");
		});
	}

	public static void walking(Walkable any) {
		any.walk();
	}
}
