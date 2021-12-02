package anonymous_Class;

public class App {
	private String name = "펭수";
	
	public static void main(String[] args) {
		// 익명 클래스는 이름없는 클래스임
		new App().start();
	}
	
	private void start() {
//		System.out.println(name);
		// Runnable 인터페이스는 객체를 만들 수 없지만 익명 클래스를 바로 만들어 추상 메소드를 구현하여 사용가능 
//		Runnable runner = new Runnable() {
//			public void run() {		// 내부 클래스로써 만든 익명 클래스
//				System.out.println(name);
//			}	
//		};
		Runnable runner2 = new Runnable() {		// 익명클래스로 만든 Runnable클래스
			public void run() {
				System.out.println("헬로! " + name);
			}
		};
//		runner.run();
//		runner2.run();
//		activate(runner);
//		activate(runner2);
		
		// 매개변수로 인터페이스의 객체가 입력될 경우 따로 클래스를 만들지 않고 익명 클래스를 이용해 바로 작성가능
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		
	}
	public void activate(Runnable runnable) {
		runnable.run(); 	// 인터페이스의 추상메소드 run 실행
	}
}
