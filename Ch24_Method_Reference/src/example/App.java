package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() {	// static메소드는 객체 생성없이 사용가능
		System.out.println("헬로우!");
	}
	
	public static void main(String[] args) {
		// 메소드 레퍼런스 : static메소드를 만들어 사용
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		// 1초에 한번씩 헬로우! 출력
		service.scheduleAtFixedRate(()->System.out.println("헬로우!!"), 0, 1000, TimeUnit.MICROSECONDS);
//		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MICROSECONDS);
								// 클래스명::메소드명 => 메소드 레퍼런스
								// 람다식과 메소드 레퍼런스 모두 사용가능. 둘중 택1.

	}
}
