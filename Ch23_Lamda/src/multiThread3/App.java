package multiThread3;

public class App {
	
	private int value = 0;
	
	private synchronized void increment() {
		// synchronized : 해당 메소드에는 한번에 하나의 스레드만 접근할 수 있음.
		value++;
	}
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};
		Thread t1 = new Thread(runnable);	// 새 스레드 t1 생성
		Thread t2 = new Thread(runnable);	// 새 스레드 t2 생성
		Thread t3 = new Thread(runnable);	// 새 스레드 t3 생성
		
		t1.start();	// t1을 실행
		t2.start();	// t2를 실행
		t3.start();	// t3를 실행
		
		System.out.println("Value: " + value);
		
		t1.join();	// 메인 스레드가 t1을 실행할때까지 대기
		t2.join();	// 메인 스레드가 t2을 실행할때까지 대기
		t3.join();	// 메인 스레드가 t2을 실행할때까지 대기
		
		System.out.println("Value: " + value);	// t1, t2가 끝난 후 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		// 멀티 스레드3
		new App().run();	// 앱 객체를 만들고 run() 메소드 실행
	}

}
