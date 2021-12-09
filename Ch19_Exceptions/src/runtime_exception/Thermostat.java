package runtime_exception;

public class Thermostat {
	// runtime 예외는 예외처리를 하지 않아도 된다
	// runtime : 프로그램 실행중 발생하는 에러이기때문에 문법상 에러는 나타나지 않는다(실행하면 에러가 발생하긴함)
	public void setTemperature(double temperature) {
		
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상입니다.");	// 새 예외를 생성
		}
		System.out.println("온도 세팅 : " + temperature);
	}
}
