package lamda_parameter;

interface Runner {
	void execute(String t);	// 추상 메서드에 매개변수가 있는 경우
}

public class App {
	public static void main(String[] args) {
		// 매개변수가 있는 경우
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("펭수");
		
		Runner run2 = x -> System.out.println(x);	// 매개변수가 1개일때 ()생략가능. 없을땐 생략불가이므로 주의
		run2.execute("길동");

	}

}
