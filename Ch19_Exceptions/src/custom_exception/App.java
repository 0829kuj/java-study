package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) {
		// throw 예외처리 - 여러개의 예외를 catch문을 추가해 따로 처리
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(-25.6);
		} catch (TempTooHighException e) {	// 온도가 높을 때
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {	// 온도가 낮을 때
			System.out.println(e.getMessage());
		}
	}

}
