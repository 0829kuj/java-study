package lamda_parameter2;

interface Runner {
	void execute(String name, String text);	// 추상 메서드에 매개변수가 있는 경우
}

public class App {
	public static void main(String[] args) {
		// 매개변수가 있는 경우
		Runner run1 = (n, t) -> System.out.printf("%s님 %s\n", n, t);
		run1.execute("펭수", "안녕하세요");
		
		greet(run1);	// 메소드로 사용
//		Runner run2 = (n, t) -> System.out.printf("%s님 %s", n, t);
//		run2.execute("길동", "건강하세요");

	}

	private static void greet(Runner run1) {
		run1.execute("길동", "건강하세요");
		
	}

}
