package lamda_example;

interface Runner {
	void execute();	// 추상메서드 1개 => 람다식 사용가능
}

public class App2 {
	public static void main(String[] args) {
		// Runner run = () -> {};	기본형태. 코드가 한줄이면 코드블럭{} 생략가능
		Runner run = () -> {
			System.out.println("헬로우!");
			System.out.println("람다식");
			};
		run.execute();
		
		System.out.println(run instanceof Runner);	// run은 Runner의 객체인가? 맞으면 true
		System.out.println(run.getClass());	// run의 클래스는 람다식
	}
}
