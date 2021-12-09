package local_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name;	// 객체를 생성해야 사용할 수 있는 인스턴스변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		// 메소드 로컬 이너 클래스
		App app = new App();
		app.run();
	}
	private void run () {
		class Printer implements Runnable {		// 로컬 이너 클래스
			
			public void run() {
				System.out.println(name);
			}
		}
//		new Printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {			
			public void run() {
				System.out.println(name);
			}
		}, 0L, 1L, TimeUnit.SECONDS);
		// 타이머를 이용해 1초에 한번씩 "엘리자베스" 출력
	} 

}
