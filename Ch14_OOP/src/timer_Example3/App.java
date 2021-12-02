package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable {	// Runnable 인터페이스를 구현
	@Override
	public void run() {	// Runnable의 추상메소드를 구현(완성)한다
		// 할 일의 코드를 적는다
		System.out.println("타이머2 헬로");
		
	}
}
class Task2 extends TimerTask {		// TimerTask클래스는 추상 클래스이므로 그걸 상속받은 Task에서 구현

	@Override
	public void run() {
		System.out.println("타이머1 헬로우");	
	}	
}

public class App {

	public static void main(String[] args) {
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task2(), 0, 1000);
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task1(), 0, 1, TimeUnit.SECONDS);	// 바로시작, 1초 주기로 실행
		

	}

}


