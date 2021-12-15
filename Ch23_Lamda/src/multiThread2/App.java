package multiThread2;

public class App {
	
	private int value = 0;
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 200; i++) {
				value++;
			}
		};
		Thread t1 = new Thread(runnable);	// 새 스레드 t1 생성
		Thread t2 = new Thread(runnable);	// 새 스레드 t2 생성
		
		t1.start();	// t1을 실행
		t2.start();	// t2를 실행
		
		System.out.println("Value: " + value);
		// t1, t2 스레드의 실행보다 메인스레드의 실행이 빠르면 value의 값이 0 혹은 400보다 적게나옴
		// 고로 컴퓨터의 성능이 느릴 경우 메인스레드의 실행이 t1, t2가 실행된 후에 실행되면 0보다 큰 값이 나온다
		
		t1.join();	// 메인 스레드가 t1을 실행할때까지 대기
		t2.join();	// 메인 스레드가 t2을 실행할때까지 대기
		
		System.out.println("Value: " + value);	// t1, t2가 끝난 후 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		// 멀티 스레드2
		new App().run();	// 앱 객체를 만들고 run() 메소드 실행
	}

}
