package innerClasses;

public class App implements Runnable {
	
	private String name = "미키 마우스";
	
	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		// activate 메소드를 사용하여 이너 클래스들로 실행하는 방법 - 3가지
		// 1. App 에 인터페이스 Runnable을 구형하여 실행
		activate(this);
		// 2. 익명 클래스 를 이용해 바로 만들기
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		// 3. 메소드 이너 클래스를 이용
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
		
	}
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}
}
