package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {		// TimerTask클래스는 추상 클래스이므로 그걸 상속받은 Task에서 구현

	@Override
	public void run() {
		System.out.println("헬로우");	
	}	
}

public class App {

	public static void main(String[] args) {
		// 타이머 예제
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);	// ms기준이므로 1000이면 1초에 한번을 의미
		// (new Task(), 0, 1000) : 0초부터 시작해 1000ms(= 1초)에 한 번씩 new Task()를 실행한다

	}
}
