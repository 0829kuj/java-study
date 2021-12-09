package throwing_exception2;

public class App {

	public static void main(String[] args) {
		// throw 예외처리
		Thermostat stat = new Thermostat();
		
		try {
			stat.setTemperature(45.6);
		} catch (Exception e) {
			// 온도 예외 발생
//			e.printStackTrace();
			// ㄴ 예외가 처름 발생한 곳 - 다음 발생한 곳 - 그다음 발생한 곳 순으로 콘솔창에 에러위치가 뜸
			System.out.println(e.getMessage());
		}
	}

}
