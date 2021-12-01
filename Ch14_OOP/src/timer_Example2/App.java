package timer_Example2;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("헬로~~!");
		
	}	
}

public class App {
	public static void main(String[] args) {
		// 타이머 예제2
//		ScheduledExecutorService executor = Excutors.newScheduledThreadPool(1);
//		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);
	}
}
